package com.TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExample {

	@Test
	public void softAssertTest()
	{
		System.out.println("Soft Assertion 1 is successful");
		SoftAssert soft=new SoftAssert();
		soft.assertEquals("A", "B");
		System.out.println("Soft Assertion 2 is successful");
		soft.assertAll();
	}
}
