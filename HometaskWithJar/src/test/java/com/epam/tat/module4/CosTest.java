package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CosTest {

private Calculator calc;
private double expected;
	
	@BeforeClass
	@Parameters({"a"})
	public void setUp(double a) {
		calc = new Calculator();
		expected = Math.cos(a);
	}

	@Test
	@Parameters({"a"})
	void testCos(double a){
		double cos = calc.cos(a);
		  Assert.assertEquals(cos, expected);
		  
	}
	
	
}
