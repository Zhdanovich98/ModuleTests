package com.epam.tat.module4;


import org.testng.Assert;
import org.testng.annotations.*;

public class DivLongTest {
	
		private Calculator calc;
		
		
		@BeforeClass
		public void setUp() throws RuntimeException{
			calc = new Calculator();
		}
		
		@Test(dataProvider = "DivLongDataProv")
		void testLongDiv(long a,long b,long expected) {
			long div = calc.div(a, b);
			  Assert.assertEquals(div, expected);	  
		}
		
		@Test(expectedExceptions = NumberFormatException.class)
		@Parameters({"a","b"})
		void testLongDivByNull(long a,long b) {
			long divByNull = calc.div(a, b);	
		}	

		@DataProvider(name = "DivLongDataProv")
		public Object[][] DivLongDataProv() {
			return new Object[][]{
			{0,1,0},
			{20,20,1},
			{10,10,1}
		};
		}
		
}

