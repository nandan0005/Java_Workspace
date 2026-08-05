package com.HandlingMultipleWindowsAndTabs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentAndChildWindowExample {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com");
		driver.manage().window().maximize();
		
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		
		WebElement help=driver.findElement(By.linkText("Help"));
		help.click();
		
		Set<String> childWindow= driver.getWindowHandles();
		System.out.println(childWindow);
		
		if(parentWindow .equals(childWindow))
		{
			System.out.println("Both id's are same");
		}
		else 
		{
			System.out.println("Both id's are not same");
		}
		
		if(childWindow.contains(parentWindow))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

}
