package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CtgTest {

	private Calculator calc;
	private double expected;
		
		@BeforeClass
		@Parameters({"a"})
		public void setUp(double a) {
			calc = new Calculator();
			expected = 1/Math.tan(a);
			System.out.println(expected);
		}

		@Test
		@Parameters({"a"})
		void testCtg(double a){
			double ctg = calc.ctg(a);
			  Assert.assertEquals(ctg, expected);
			  
		}
		
		
	}
