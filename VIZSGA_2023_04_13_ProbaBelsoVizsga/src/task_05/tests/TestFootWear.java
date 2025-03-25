package task_05.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import task_05.model.FootWear;

public class TestFootWear {

	@Test
	public void testGetFootWearStatusTrueText() {
		FootWear obj = new FootWear(1, "teszt cip�", "Teszt gy�rt�", "Teszt model", 45, 1, 99, true);
		String actual = obj.getStatusText();
		String expected = "Aktív";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetFootWearStatusFalseText() {
		FootWear obj = new FootWear(1, "teszt cip�", "Teszt gy�rt�", "Teszt model", 45, 1, 99, false);
		String actual = obj.getStatusText();
		String expected = "Inaktív";
		assertEquals(expected, actual);
	}
	
}
