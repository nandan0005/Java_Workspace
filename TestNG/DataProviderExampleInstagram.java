package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExampleInstagram {

	@DataProvider(name="loginData")
	public Object[][] getdata(){
		return new Object[][] {
			{"ninefisher0005","nandan@005"},
			{"Nandan0005","nandan@2005"},
			{"nandan@8","ninefisher@1"},
			{"ninefisher0005","nandan@2005"}
		};
	}
	
	@Test(dataProvider="loginData")
	public void loginTest(String username,String password)
	{
		System.out.println("Username: "+username+"Password: "+password);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement userName=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div/div[3]/div/div/div/div/div/div/div/div/div/div/div[2]/form/div/div[1]/div/div[1]/div/div/div[1]/input"));
		userName.sendKeys(username);
		WebElement passWord=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div/div[3]/div/div/div/div/div/div/div/div/div/div/div[2]/form/div/div[1]/div/div[2]/div/div/div[1]/input"));
		passWord.sendKeys(password);
		WebElement login=driver.findElement(By.className("x1ja2u2z"));
		login.click();

	}
}
