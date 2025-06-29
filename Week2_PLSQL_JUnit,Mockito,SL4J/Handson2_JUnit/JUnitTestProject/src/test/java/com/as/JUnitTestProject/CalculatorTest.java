package com.as.JUnitTestProject;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
	Calcultor variable;
	@BeforeEach
	public void setup() {
		variable=new Calcultor();
		System.out.println("Steup Complete");
	}
	@AfterEach
	public void teardown() {
		System.out.println("Teardown after test");
		
	}
	@Test
	public void TwoPlusTwoEqualFour() {
		
		assertEquals(4, variable.addition(2, 2),"2+2 should be 4");
	}
	
	public void ThreeMultplyTwoEqualsSix() {
		
		assertEquals(6,variable.multiply(2,3),"2*3 should be 6");
	}
}
