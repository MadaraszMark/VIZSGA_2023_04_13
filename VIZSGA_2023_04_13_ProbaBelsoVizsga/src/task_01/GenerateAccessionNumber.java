package task_01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class GenerateAccessionNumber {

	public void generateAccessionNumber(Item itemObj, int minInterval, int maxInterval) {
		char separator ='_';
		Random r = new Random();
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatted = DateTimeFormatter.ofPattern("yyyyMMDd");
		String todayFormatted = today.format(formatted);
		
		int randomNumber = r.nextInt(maxInterval - minInterval + 1 ) + minInterval;
		String accessionNumber = itemObj.getName() + separator + todayFormatted + separator+ randomNumber + "";
		itemObj.setAccessionNumber(accessionNumber);
	}
}
