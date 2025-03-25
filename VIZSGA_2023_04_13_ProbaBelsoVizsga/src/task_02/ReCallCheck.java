package task_02;

public class ReCallCheck {

	public boolean reCallCheck(MotorCycle motorCycleObj) {
		boolean result = false;
		if (motorCycleObj.getManufacturer().equals("Suzuki")
				&& motorCycleObj.getModel().equals("GSX-R 1000R")
				&& motorCycleObj.getManufacturedYear()==2020) {
			result = true;
		}
		return result;
	}
}
