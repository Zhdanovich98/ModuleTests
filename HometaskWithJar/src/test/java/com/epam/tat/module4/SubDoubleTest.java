package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubDoubleTest {
	
	private Calculator calc;
	
	@BeforeClass
	public void setUp() throws RuntimeException{
		calc = new Calculator();
	}
	
	@Test(dataProvider = "SubDoubleDataProv")
	void testLongMult(double a,double b,double expected) {
		double mult = calc.sub(a, b);
		  Assert.assertEquals(mult, expected);	  
	}
	
	@DataProvider(name = "SubDoubleDataProv")
	public Object[][] SubDoubleDataProv() {
		return new Object[][]{
		{10,10,0},
		{0,10,-10}
	};
	}
	
}


