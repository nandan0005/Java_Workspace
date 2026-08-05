package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DriverCommand;

public class LocatorsExampleSalesforce {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Desktop\\Java Workspace\\CoreJavaPrograms\\BrowserDriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://login.salesforce.com");
		Thread.sleep(2000);

		driver.manage().window().maximize();
		Thread.sleep(2000);

		//id
		/*WebElement userName=driver.findElement(By.id("username"));
		userName.sendKeys("nandan0005");

		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("Nandan@2005");*/

		//name
		/*WebElement user=driver.findElement(By.name("username"));
		user.sendKeys("ninefisher05");

		WebElement pass1=driver.findElement(By.name("pw"));
		pass1.sendKeys("Nandan@123");*/
		 
		//className
		WebElement username=driver.findElement(By.className("input"));
		username.sendKeys("reddy1");
		
		
	}

}
