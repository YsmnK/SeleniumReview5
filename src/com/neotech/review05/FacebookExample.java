package com.neotech.review05;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookExample {

	final static String url = "https://www.facebook.com/";
	
	public static void main(String[] args) throws InterruptedException {
		//https://www.facebook.com/

		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		//You can specify the version of Chrome Browser you want to use
		//options.setBrowserVersion(url);
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	
		driver.get(url);	
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Thread.sleep(1000);

		driver.findElement(By.id("email")).sendKeys("neotechrocks@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Neotech@123");

		driver.findElement(By.name("login")).click();
		Thread.sleep(20000);

		driver.findElement(By.xpath("")).click();
		Thread.sleep(5000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(int i=1;i<=15;i++) {
			js.executeScript("windowscrollBy(0, 300");
			Thread.sleep(500);
		}
		
		Thread.sleep(2000);
	driver.quit();
				
	}

}
