package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DriverCommand;

public class LocatorsExampleInstagram {

	public static void main(String[] args) throws InterruptedException {

		
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://instagram.com");
		Thread.sleep(2000);

		driver.manage().window().maximize();
//		Thread.sleep(2000);

		//id
		/*
		 * WebElement userName=driver.findElement(By.id("_R_32d9lplcldcpbn6b5ipamH1_"));
		 * userName.sendKeys("nandan0005");
		 * 
		 * WebElement pass=driver.findElement(By.id("_R_33d9lplcldcpbn6b5ipamH1_"));
		 * pass.sendKeys("Nandan@2005");
		 */

		//name
		/*WebElement user=driver.findElement(By.name("email"));
		user.sendKeys("ninefisher05");

		WebElement pass1=driver.findElement(By.name("pass"));
		pass1.sendKeys("Nandan@123");*/
		
		//className
		WebElement username=driver.findElement(By.className("x1i10hfl"));
		username.sendKeys("reddy1");



	}

}
