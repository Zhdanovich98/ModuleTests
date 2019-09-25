package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.*;

public class SumDoubleTest {

	private Calculator calc;
	
	
	
	@BeforeClass
	public void setUp() {
		calc = new Calculator();
		System.out.println("beforeslass");
	}
	
	
	@Test(dataProvider = "sumDataProv")
	void testDoubleSum(double a,double b,double expected) {
		
		double sum = calc.sum(a, b);
		System.out.println(sum);
		  Assert.assertEquals(sum, expected);
		  
	}
	
	@DataProvider(name = "sumDataProv")
	public Object[][] sumDataProv() {
		return new Object[][]{
		{0,0,0},
		{1,-1,0},
		{10,10,20}
	};
	}
}
