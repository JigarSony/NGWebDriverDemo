package com.test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CalculatorPage;

public class CalTest {

	CalculatorPage calPage;

	@BeforeTest
	public void setup() {
		calPage = new CalculatorPage();
	}

	@Test(priority = 1)
	public void testSum() {
		String res = calPage.sum("10", "20");
		Assert.assertEquals(res, "30");
	}
	
	@Test(priority = 2)
	public void testSub() {
		String res = calPage.sub("20", "10");
		Assert.assertEquals(res, "10");
	}
	
	@Test(priority = 3)
	public void testDiv() {
		String res = calPage.div("10", "2");
		Assert.assertEquals(res, "5");
	}

}
