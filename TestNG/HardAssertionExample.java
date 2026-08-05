package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionExample {

	@Test
	public void hardAssertTest() 
	{
		System.out.println("Hard Assertion 1 is successful");
		Assert.assertEquals("A", "B");
		System.out.println("Hard Assertion 2 is successful");
	}
}
