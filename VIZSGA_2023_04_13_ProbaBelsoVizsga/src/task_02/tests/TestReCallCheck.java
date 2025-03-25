package task_02.tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import task_02.MotorCycle;
import task_02.ReCallCheck;

public class TestReCallCheck {

	@Test
	public void testReCallCheckReturnTrue() {
		MotorCycle motorCycleObj = new MotorCycle("KSEF-12345", "Suzuki", "GSX-R 1000R", 9800000, 2020);
		ReCallCheck recallCheckObj = new ReCallCheck();
		assertTrue(recallCheckObj.reCallCheck(motorCycleObj));
	}
	
	@Test
	public void testRecallCheckReturnFalse() {
        MotorCycle motorCycleObj = new MotorCycle("KSEF-12345", "Suzuki", "GSX-R 1000R", 8000000, 2019);
        ReCallCheck recallCheckObj = new ReCallCheck();
        assertFalse(recallCheckObj.reCallCheck(motorCycleObj));
    }
}
