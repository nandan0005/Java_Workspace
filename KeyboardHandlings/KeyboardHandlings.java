package com.KeyboardHandlings;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardHandlings {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)"," ");
		
		WebElement user= driver.findElement(By.id("userName"));
		user.sendKeys("LiveTech");
		
		WebElement mail= driver.findElement(By.id("userEmail"));
		mail.sendKeys("livetech123@gmail.com");
		
		WebElement currAddress=driver.findElement(By.id("currentAddress"));
		currAddress.sendKeys("Ameerpet, Hyderabad");
		
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		WebElement permAddress=driver.findElement(By.id("permanentAddress"));
		action.keyDown(Keys.TAB);
		
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		
		
		
	}

}
