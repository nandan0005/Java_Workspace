package com.BrowserInteractionCommands;

import org.openqa.selenium.chrome.ChromeDriver;

public class Commands {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.silentOutput", "true");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Desktop\\Java Workspace\\CoreJavaPrograms\\BrowserDriverFiles\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();

		//.get("url");
		driver.get("https://www.flipkart.com");
		Thread.sleep(2500);
		//.maximize();
		driver.manage().window().maximize();

		//.getPageSource();
		//String code=driver.getPageSource();
		//System.out.println(code);

		//.getTitle();
		String title=driver.getTitle();
		System.out.println(title);

		//getCurrentURL();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2500);

		//.navigate().to();
		driver.navigate().to("https://www.instagram.com");
		Thread.sleep(2500);

		//.navigate().back();
		driver.navigate().back();
		Thread.sleep(2500);

		//.navigate().forward();
		driver.navigate().forward();
		Thread.sleep(2500);

		//navigate().refresh();
		driver.navigate().refresh();
		Thread.sleep(2500);

		//.close();
		driver.close();
		
		//.quit();
		driver.quit();
	}

}
