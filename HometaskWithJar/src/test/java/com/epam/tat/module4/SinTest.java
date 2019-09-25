package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SinTest {

private Calculator calc;
private double expected;
	
	@BeforeClass
	@Parameters({"a"})
	public void setUp(double a) {
		calc = new Calculator();
	    expected = Math.sin(a);
	}

	@Test
	@Parameters({"a"})
	void testSin(double a){
		double sin = calc.sin(a);
		  Assert.assertEquals(sin, expected);
		  
	}
	
	
}
