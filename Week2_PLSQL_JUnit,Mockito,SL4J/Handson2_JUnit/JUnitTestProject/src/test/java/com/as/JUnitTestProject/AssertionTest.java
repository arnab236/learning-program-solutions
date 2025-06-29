package com.as.JUnitTestProject;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AssertionTest {
	@Test
	public void testAssertion() {
		//Assert Equals
		assertEquals(5,2+3);
		
		//Assert True
		assertTrue(5>3);
		
		//Assert NULL
		assertNull(null);
		
		//Assert Not Null
		assertNotNull(new Calcultor());
		
	}
}
