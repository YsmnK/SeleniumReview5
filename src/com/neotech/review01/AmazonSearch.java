package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		String url="https://www.amazon.com/";
		driver.get(url);

		
		Thread.sleep(7000);
		
		//there are 8 locators to find elements in DOM
		//id,name,className,linkText,partialLinkText,tagName,xPtah,cssSelector
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Messy Jersey");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		
		driver.quit();
	}

}
