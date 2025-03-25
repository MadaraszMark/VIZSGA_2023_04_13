package task_05.main;

import javax.swing.SwingUtilities;

import task_05.dao.FootWearCategoryDao;
import task_05.dao.FootWearDao;
import task_05.presenter.FootWearPresenter;
import task_05.view.View;

public class App {

	public App() {
		final View view = new View();
		final FootWearDao footWearDao = new FootWearDao();
		final FootWearCategoryDao footWearCategoryDao = new FootWearCategoryDao();
		new FootWearPresenter(view, footWearDao, footWearCategoryDao);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new App();
			}
		});

	}

}
