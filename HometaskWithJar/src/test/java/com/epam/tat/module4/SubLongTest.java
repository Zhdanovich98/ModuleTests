package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubLongTest {
	
	private Calculator calc;
	
	@BeforeClass
	public void setUp() throws RuntimeException{
		calc = new Calculator();
	}
	
	@Test(dataProvider = "SubLongleDataProv")
	void testLongMult(long a,long b,long expected) {
		long mult = calc.sub(a, b);
		  Assert.assertEquals(mult, expected);	  
	}
	
	@DataProvider(name = "SubLongleDataProv")
	public Object[][] SubLongleDataProv() {
		return new Object[][]{
		{10,10,0},
		{0,10,-10}
	};
	}
	
}
