package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.*;

public class MultDoubleTest {

	private Calculator calc;
	
	
	@BeforeClass
	public void setUp() throws RuntimeException{
		calc = new Calculator();
	}
	
	@Test(dataProvider = "MultDoubleDataProv")
	void testDoubleMult(double a,double b,double expected) {
		double mult = calc.mult(a, b);
		  Assert.assertEquals(mult, expected);	  
	}
	
	@DataProvider(name = "MultDoubleDataProv")
	public Object[][] MultDoubleDataProv() {
		return new Object[][]{
		{0,0,0},
		{100,100,10000}
	};
	}
	
}
