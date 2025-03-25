package task_01;

public class App {

	public static void main(String[] args) {
		Item itemObj = new Item("tesztNev", 100, 5, true, false);
		GenerateAccessionNumber generateAccessionNumberObj = new GenerateAccessionNumber();
		ReadDataFromConsole readDataFromConsoleObj = new ReadDataFromConsole();
		
		int minInterval = 0;
		int maxInterval = 0;
		do {
			minInterval = readDataFromConsoleObj.getIntervalFromConsole("Kérem adja meg az intervallum minimum értékét: ");
			maxInterval = readDataFromConsoleObj.getIntervalFromConsole("Kérem adja meg az intervallum maximum értékét: ");
		}while(minInterval >= maxInterval);
		
        generateAccessionNumberObj.generateAccessionNumber(itemObj, minInterval, maxInterval);
        System.out.println(itemObj.toString());
		
		// Kész - 2. Vizsgafeladat
		
	}
}
