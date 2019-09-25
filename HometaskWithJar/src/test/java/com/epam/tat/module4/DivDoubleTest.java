package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.*;

public class DivDoubleTest {

	
	private Calculator calc;
	
	
	@BeforeClass
	public void setUp() {
		calc = new Calculator();
	}
	
	@Test(dataProvider = "DivDoubleDataProv")
	void testDoubleDiv(double a,double b,double expected) {
		double div = calc.div(a, b);
		  Assert.assertEquals(div, expected);	  
	}
	
	@Test
	@Parameters({"a","b"})
	void testDoubleDivByNull(double a,double b) {
		double divByNull = calc.div(a, b);	
		
	}	

	@DataProvider(name = "DivDoubleDataProv")
	public Object[][] DivDoubleDataProv() {
		return new Object[][]{
		{0,1,0},
		{20,20,1},
		{10,10,1}
	};
	}
	
}