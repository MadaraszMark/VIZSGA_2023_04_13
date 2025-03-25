package task_01.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import task_01.GenerateAccessionNumber;
import task_01.Item;

public class TestGenerateAccessionNumber {

	@Test
	public void testAccessionNumberContainsSnake() {
		Item itemObj = new Item("tesztNev", 100, 5, true, false);
		GenerateAccessionNumber generateAccessionNumberObj = new GenerateAccessionNumber();
		generateAccessionNumberObj.generateAccessionNumber(itemObj, 10, 20);
		assertTrue(itemObj.getAccessionNumber().contains("_"));
	}
	
	@Test
	public void testAccessionNumberDoesNotContainsKebabCase() {
		Item itemObj = new Item("tesztNev", 100, 5, true, false);
		GenerateAccessionNumber generateAccessionNumberObj = new GenerateAccessionNumber();
		generateAccessionNumberObj.generateAccessionNumber(itemObj, 10, 20);
		assertTrue(!itemObj.getAccessionNumber().contains("-"));
	}
}
