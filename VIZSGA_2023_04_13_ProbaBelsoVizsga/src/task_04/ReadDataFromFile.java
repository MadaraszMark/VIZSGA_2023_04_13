package task_04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class ReadDataFromFile {
	
	public List<Product> readDataFromCsv() {
		List<Product> products = new ArrayList<Product>();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("task_04_data/viragbolt.csv"), "UTF-8"));
			String header = br.readLine();
			while(br.ready()) {
				String row = br.readLine();
				if(row.contains("hiba")) {
					System.err.println("Hibás sor kihagyva!");
                    continue;
				}
				products.add(getProductFromRow(row));
			}
			br.close();
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("A kódolás hibás!");
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("Nem található a fájl!");
		} catch (IOException e) {
			System.out.println("I/O hiba történt!");
			//e.printStackTrace();
		}
		return products;
	}
	
	public Product getProductFromRow(String row) {
		String[] rowData = row.split(";");
        return new Product(
                rowData[0],
                rowData[1],
                Short.parseShort(rowData[2]),
                Integer.parseInt(rowData[3]),
                Integer.parseInt(rowData[4])
        );
	}

}
