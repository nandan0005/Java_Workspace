package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTestNG{

	
	@Test
	@Parameters({"username","password"})
	public void loginTest(String user,String pass)
	{
		System.out.println("Username is: "+user);
		System.out.println("Password is: "+pass);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement userName=driver.findElement(By.id("username"));
		userName.sendKeys(user);
		WebElement passWord=driver.findElement(By.id("password"));
		passWord.sendKeys(pass);
		WebElement login=driver.findElement(By.id("Login"));
		login.click();

	}
	
}