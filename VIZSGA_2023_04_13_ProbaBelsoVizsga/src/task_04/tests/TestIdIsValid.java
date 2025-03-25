package task_04.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import task_04.Product;

public class TestIdIsValid {

	@Test
	public void testIsIdLengthValid() {
		Product productObj = new Product("SWE-1234","Teszt csokor",(short)2,22,22);
		boolean actual = productObj.isIdLengthValid();
		boolean expected = true;
		assertEquals(expected, actual);
	}
	
	@Test
    public void testGetCategoryTextOne() {
		Product productObj = new Product("SWE-1234","Teszt csokor",(short)1,22,22);
		String actual = productObj.getCategoryText();
		String expected = "CSOKOR";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetCategoryTextTwo() {
		Product productObj = new Product("SWE-1234","Teszt csokor",(short)2,22,22);
        String actual = productObj.getCategoryText();
        String expected = "VIRÁGBOX";
        assertEquals(expected, actual);
	}
	
}
