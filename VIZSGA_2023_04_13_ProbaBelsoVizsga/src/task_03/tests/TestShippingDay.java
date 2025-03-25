package task_03.tests;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import task_03.NotebookPart;

public class TestShippingDay {

	@Test
	public void setShippingDayIfStockAmountIsZero() {
		NotebookPart notebookPart = new NotebookPart(
				1,
				"tesztN�v",
				"STKF-23141",
				"Toshiba", 
				"FESF-234",
				0,
				35800);
		notebookPart.setShippingDay(4);
		int actual = notebookPart.getShippingDay();
		int expected = 30;
		assertEquals(expected, actual);
	}
	
	@Test
    public void setShippingDayIfStockAmountIsGreaterThanZero() {
		NotebookPart notebookPart = new NotebookPart(
                1,
                "tesztN�v",
                "STKF-23141",
                "Toshiba",
                "FESF-234",
                4,
                35800);
		notebookPart.setShippingDay(10);
		int actual = notebookPart.getShippingDay();
		int expected = 10;
		assertEquals(expected, actual);
	}
}
