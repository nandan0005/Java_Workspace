package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExampleGitHub {

	@DataProvider(name="loginData")
	public Object[][] getdata(){
		return new Object[][] {
			{"nandan0005","nandan@005"},
			{"Nandan005","Nandan@012005"},
			{"nandan@8","ninefisher@1"},
			{"nandan0005","Nandan@012005"}
		};
	}
	
	@Test(dataProvider="loginData")
	public void loginTest(String username,String password)
	{
		System.out.println("Username: "+username+ " Password: "+password);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://github.com/login");
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement userName=driver.findElement(By.id("login_field"));
		userName.sendKeys(username);
		WebElement passWord=driver.findElement(By.id("password"));
		passWord.sendKeys(password);
		WebElement login=driver.findElement(By.className("btn"));
		login.click();

	}
}
