package com.esprit.integrationContinue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.esprit.integrationContinue.Test.Calculator;



public class CalculatorTest {
	Calculator calculator = new Calculator();

	@BeforeClass
	public static void initCalculator() {

	}

	@Before
	public void beforeEachTest() {
		System.out.println("This is executed before each Test");
	}

	@After
	public void afterEachTest() {
		System.out.println("This is exceuted after each Test");
	}

	@Test
	public void testSum() {
		int result = calculator.sum(3, 4);

		assertEquals(7, result);
	}
	
	@Test
	public void test1_itShouldAddDevelopper()
	{
		//TRYING TO ADD A DEPARTMENT
		
		assertTrue(calculator.addDevelopper(1,"Najd","labben","Ariana","JAVA/JEE"));
		assertTrue(calculator.addDevelopper(1,"Issam","Benbelgace","Ariana","JAVA/JEE"));
		assertTrue(calculator.addDevelopper(1,"Ahmed","Bouhlel","Soussa","ASP.Net"));
		assertTrue(calculator.addDevelopper(1,"Slim","BK","Ariana","Angularjs"));
	}

	@Test
	public void testDivison() {
		try {
			int result = calculator.divison(10, 2);

			assertEquals(5, result);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

	@Test(expected = Exception.class)
	public void testDivisionException() throws Exception {
		calculator.divison(10, 0);
	}

	@Ignore
	@Test
	public void testEqual() {
		boolean result = calculator.equalIntegers(20, 20);

		assertFalse(result);
	}

	@Ignore
	@Test
	public void testSubstraction() {
		int result = 10 - 3;

		assertTrue(result == 9);
	}
}