package task_01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadDataFromConsole {
	
	public int getIntervalFromConsole(String message) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(message);
		int interval = 0;
		try {
			interval = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return interval;
	}

}
