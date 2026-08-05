package com.HandlingMultipleWindowsAndTabs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.handler.codec.http.HttpScheme;

public class HandlingMultiWindowsandTabsExample {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com");
		driver.manage().window().maximize();
		String title1= driver.getTitle();
		System.out.println(title1);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com");
		String title2= driver.getTitle();
		System.out.println(title2);
		
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in");
		String amzTitle= driver.getTitle();
		System.out.println(amzTitle);
		
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.github.com");
		String title4= driver.getTitle();
		System.out.println(title4);
		
//		Thread.sleep(3000);
//		driver.close();
		Thread.sleep(2000);
		driver.quit();

	}

}
