package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowTest {
	
private Calculator calc;
	
    @BeforeClass
	public void setUp() {
		calc = new Calculator();
	}
	
	@Test(dataProvider = "PowDataProv")
	void testPow(double a, double b, double expected) {
		double pow = calc.pow(a, b);
		  Assert.assertEquals(pow, expected);	  
	}
	
	@DataProvider(name = "PowDataProv")
	public Object[][] PowDataProv() {
		return new Object[][]{
		{0,0,1},
		{10,3, 1000}
	};
	}
	
}



