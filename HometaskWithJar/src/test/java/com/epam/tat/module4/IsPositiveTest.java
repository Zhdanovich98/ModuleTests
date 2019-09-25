package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.*;

public class IsPositiveTest {

	private Calculator calc;
	
	@BeforeClass
	public void setUp() {
		calc = new Calculator();
	}
	
	@Test(dataProvider = "PositiveDataProv")
	void testPositive(long a,boolean expected) {
		boolean positive = calc.isPositive(a);
		System.out.println(positive);
		Assert.assertEquals(positive, expected);	  
	}
	
	@DataProvider(name = "PositiveDataProv")
	public Object[][] PositiveDataProv() {
		return new Object[][]{
		{1, true},
		{0, true},
		{0, false}
	};
	}
	
    
}