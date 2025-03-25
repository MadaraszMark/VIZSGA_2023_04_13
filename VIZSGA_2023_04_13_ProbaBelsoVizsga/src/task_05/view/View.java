package task_05.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import task_05.model.FootWear;

public class View {
	
	private final ArrayList<IViewListener> listeners;
	private JScrollPane scrollPane;
	private JTable tableFootWear;
	private JFrame footWearListFrame;
	private JButton btnExit;

	public View() {
		
		footWearListFrame = new JFrame();
		footWearListFrame.setBounds(300, 200, 1020, 650);
		footWearListFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		footWearListFrame.getContentPane().setLayout(null);
		footWearListFrame.setTitle("Lábbelik");
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(35,21,921,180);
		footWearListFrame.getContentPane().add(scrollPane);
		
		tableFootWear = new JTable();
		scrollPane.setViewportView(tableFootWear);
	
		btnExit = new JButton("KIL�P");
		btnExit.setBackground(Color.RED);
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnExit.setBounds(824, 530, 132, 60);
		footWearListFrame.getContentPane().add(btnExit);
		
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				notifyListenersOnButtonClickedExitApplication();
			}
		});
		
		this.listeners = new ArrayList<IViewListener>();
		footWearListFrame.setVisible(true);
	}
	
	public void addListener(final IViewListener listener) {
		listeners.add(listener);
	}
	
	private void notifyListenersOnButtonClickedExitApplication() {
		for (final IViewListener listener : listeners) {
			listener.onButtonClickedExit();
		}
	}
	
	public void setTableCellCenter() {
		DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
		renderer.setHorizontalAlignment(JLabel.CENTER);
		for (int i = 0; i < tableFootWear.getColumnCount(); i++) {
			tableFootWear.getColumnModel().getColumn(i).setCellRenderer(renderer);
		}
	}
	
	public void setModelToTableFootWear(List<FootWear> footWears) {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Név");
		model.addColumn("Gyártó");
		model.addColumn("Model");
		model.addColumn("Méret");
		model.addColumn("Nettó ár (Ft)");
		model.addColumn("Állapot");
		
		for (FootWear item : footWears) {
			model.addRow(new Object[] {
					item.getId(), 
					item.getName(),
					item.getManufacturer(),
					item.getModel(), 
					item.getSize(), 
					item.getNetPrice(),
					item.getStatusText()
			});
		}
		tableFootWear.setModel(model);
		tableFootWear.setRowHeight(30);
		setTableCellCenter();
	}
}
