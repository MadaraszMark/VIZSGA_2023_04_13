package task_02;

public class App {

	public static void main(String[] args) {
		MotorCycle motorCycleObj = new MotorCycle("KSEF-12345", "Suzuki", "GSX-R 1000R", 9800000, 2020);
		ReCallCheck recallCheckObj = new ReCallCheck();
		System.out.println(recallCheckObj.reCallCheck(motorCycleObj));
		
		ReadDataFromConsole readDataFromConsoleObj = new ReadDataFromConsole();
		MotorCycle motorCycleObj2 = readDataFromConsoleObj.getDataFromConsole();
		System.out.println(motorCycleObj2.toString());
		if(recallCheckObj.reCallCheck(motorCycleObj2)) {
            System.out.println("A motorra van visszahívás kiadva!");
        }else {
            System.out.println("A motorra nincs visszahívás kiadva!");
        }
		
		// Kész 
		
	}
}
