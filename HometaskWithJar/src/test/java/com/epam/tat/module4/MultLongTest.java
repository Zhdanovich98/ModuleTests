package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultLongTest {
	private Calculator calc;
	
	
	@BeforeClass
	public void setUp() throws RuntimeException{
		calc = new Calculator();
	}
	
	@Test(dataProvider = "MultLongDataProv")
	void testLongMult(long a,long b,long expected) {
		long mult = calc.mult(a, b);
		  Assert.assertEquals(mult, expected);	  
	}
	
	@DataProvider(name = "MultLongDataProv")
	public Object[][] MultLongDataProv() {
		return new Object[][]{
		{0,0,0},
		{100,100,10000}
	};
	}
	
}


