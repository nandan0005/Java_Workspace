package com.Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotsExample {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		
		//1. Capture Screenshot as a Full Page
		File screenshot1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot1, new File(".\\Screenshots\\InstagramHomepage.png"));
		
		//2. Capture Screenshot as a Section on page
		WebElement loginModule=driver.findElement(By.className("x1n2onr6")); 
		File screenshot2=loginModule.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot2, new File(".\\Screenshots\\InstagramLoginModule.png"));

		
		//3. Capture Screenshot using Element on a page
		WebElement logo=driver.findElement(By.className("x15mokao"));
		File screenshot3=logo.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot3, new File(".\\Screenshots\\InstagramLogo.png"));
		 
	}

}
