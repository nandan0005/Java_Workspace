package com.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNGAnnotations {

	@Test
	public void Test()
	{
		System.out.println("This is a test");
	}
	
	@BeforeMethod
	public void BeforeMethod() 
	{
		System.out.println("This will execute before method");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("THis will execute after method");
	}
	

	@BeforeTest 
	public void BeforeTest() {
		System.out.println("THis will execute before test"); }
	 
}
