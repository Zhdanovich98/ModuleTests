package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.*;

public class IsNegativeTest {
	
private Calculator calc;
		
	@BeforeClass
	public void setUp() {
		calc = new Calculator();
	}
	
	@Test(dataProvider = "NegativeDataProv")
	void testNegative(long a,boolean expected) {
		boolean negative = calc.isNegative(a);
		System.out.println(negative);
		Assert.assertEquals(negative, expected);	  
	}
	
	@DataProvider(name = "NegativeDataProv")
	public Object[][] NegativeDataProv() {
		return new Object[][]{
		{-1, true},
		{0, false},
		{0, true}
	};
	}
	
    
}
