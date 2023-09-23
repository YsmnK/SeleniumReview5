package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		String url="https://www.instagram.com/";
		
		driver.get(url);
		//will wait for the page and elements to be loaded
		//will NOT keep the history
		
		driver.navigate().to(url);
		//will wait for the page and elements to be loaded
		//will NOT keep the history
		
		driver.manage().window().fullscreen(); //will make full screen
		
		Thread.sleep(1000);
		
		driver.manage().window().minimize(); //will make minimaze screen
		Thread.sleep(1000);
		
		driver.manage().window().fullscreen(); //will make full screen
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.mlssoccer.com/");
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.fifa.com/");
		Thread.sleep(1000);
		
		driver.navigate().back(); // will bring us back to the second page, previous page
		Thread.sleep(1000);
		
		driver.navigate().back(); // will bring us back to the first page, previous page
		Thread.sleep(1000);
		
		driver.navigate().forward(); // will bring us back to the first page, previous page
		Thread.sleep(1000);
		
		driver.navigate().refresh();// will 
		Thread.sleep(1000);
		
		driver.quit();
		


	}

}
