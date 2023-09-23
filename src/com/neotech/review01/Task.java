package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {

		// Breask until 1:00
		// Open Chrome browser
		// Navigate to https://www.selenium.dev/
		// Navigate to https://www.google.com/
		// Go back and forth 10 times.
		// Use a for loop
		// Wait 1 second between each navigation

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.selenium.dev/");

		driver.navigate().to("https://www.google.com/");
		Thread.sleep(1000);
		
		for(int i=0;i<=10;i++) {
			driver.navigate().back();
			Thread.sleep(500);
			driver.navigate().forward();
			Thread.sleep(500);
		}
		
		driver.quit();
			
		
	}

}
