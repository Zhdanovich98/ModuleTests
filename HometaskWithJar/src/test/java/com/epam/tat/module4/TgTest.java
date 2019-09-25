package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TgTest {

	private Calculator calc;
	private double expected;
		
		@BeforeClass
		@Parameters({"a"})
		public void setUp(double a) {
			calc = new Calculator();
			expected = Math.tan(a);
			System.out.println(expected);
		}

		@Test
		@Parameters({"a"})
		void testTg(double a){
			double tg = calc.tg(a);
			  Assert.assertEquals(tg, expected);
			  
		}
		
		
	}
