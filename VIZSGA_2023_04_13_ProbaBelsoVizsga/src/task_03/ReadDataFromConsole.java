package task_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadDataFromConsole {
	
	public NotebookPart readDataFromConsole() {
		int id;
		String name;
		String accessionNumber;
		String manufacturer;
		String model;
		int stockAmount;
		int netPrice;
		int shippingDay;
		NotebookPart parts = null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Kérem adja meg a laptop adatait!");
			System.out.print("Azonosító(egész szám): ");
			id = Integer.parseInt(br.readLine());
			System.out.print("Név(szöveg): ");
			name = br.readLine();
			System.out.print("Leltárszám(szöveg): ");
			accessionNumber = br.readLine();
			System.out.print("Gyártó(szöveg): ");
			manufacturer = br.readLine();
			System.out.print("Model(szöveg): ");
			model = br.readLine();
			System.out.print("Raktármennyiség(szám): ");
			stockAmount = Integer.parseInt(br.readLine());
			System.out.print("Nettó ár(tört szám is lehet): ");
			netPrice = Integer.parseInt(br.readLine());
			System.out.print("Kiszállítási nap(szám): ");
			shippingDay = Integer.parseInt(br.readLine());
			
            parts = new NotebookPart(id, name, accessionNumber, manufacturer, model, stockAmount, netPrice);
            parts.setShippingDay(shippingDay);
		} catch (NumberFormatException e) {
			System.err.println("Hiba!");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return parts;
	}

}
