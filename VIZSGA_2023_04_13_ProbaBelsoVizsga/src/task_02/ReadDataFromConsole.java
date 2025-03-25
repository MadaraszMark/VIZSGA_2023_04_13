package task_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadDataFromConsole {
	
	public MotorCycle getDataFromConsole() {
		String id;
		String manufacturer;
		String model;
		double netPrice;
		int manufacturedYear;
		MotorCycle motorCycle = null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Kérem adja meg a motorkerékpár adatait!");
			System.out.print("Azonosító (egész szám): ");
			id = br.readLine();
			System.out.print("Gyártó (szöveg): ");
			manufacturer = br.readLine();
			System.out.print("Model (szöveg): ");
			model = br.readLine();
			System.out.print("Nettó ár (tört szám): ");
			netPrice = Double.parseDouble(br.readLine());
			System.out.print("Gyártási év (szám): ");
			manufacturedYear = Integer.parseInt(br.readLine());
			
            motorCycle = new MotorCycle(id, manufacturer, model, netPrice, manufacturedYear);
            
		} catch (NumberFormatException e) {
			System.err.println("Hiba!");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return motorCycle;
	}

}
