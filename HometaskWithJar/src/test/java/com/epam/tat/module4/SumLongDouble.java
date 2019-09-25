package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumLongDouble {
	
	private Calculator calc;
	

	
	@BeforeClass
	public void setUp() {
		calc = new Calculator();
	}
	
	
	@Test(dataProvider = "sumLongDataProv")
	void testLongSum(long a,long b,long expected) {
		long sum = calc.sum(a, b);
		  Assert.assertEquals(sum, expected);
		  
	}
	
	@DataProvider(name = "sumLongDataProv")
	public Object[][] sumLongDataProv() {
		return new Object[][]{
		{0,0,0},
		{1,-1,0},
		{10,10,20}
	};
	}
}
