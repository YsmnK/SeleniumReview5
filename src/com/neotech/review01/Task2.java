package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		// Go to https://demoqa.com/text-box
		// Fill the form and submit
		// Use xPath or CSS Selector

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String url = "https://demoqa.com/text-box";

		driver.get(url);

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Yasemin");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("yasemin.k@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Baldwin Park , Florida");
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Baldwin Park,Florida");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
