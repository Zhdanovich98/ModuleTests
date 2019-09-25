package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.*;

public class SqrtTest {

private Calculator calc;
	
	@BeforeClass
	public void setUp() {
		calc = new Calculator();
	}

	@Test
	@Parameters({"a","expected"})
	void testSqrt(double a,double expected){
		double sqrt = calc.sqrt(a);
		  Assert.assertEquals(sqrt, expected);
		  
	}
	
	
}
