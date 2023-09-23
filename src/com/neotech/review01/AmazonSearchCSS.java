package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchCSS {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		String url="https://www.amazon.com/";
		driver.get(url);

		
		Thread.sleep(7000);
		
	//	# (hashtag) means id
	//	#twotabsearchtextbox--> any element with id=twotabsearchtextbox
	//  input#twotabsearchtextbox-->	any input with id=twotabsearchtextbox
	//  .(period) means class
    //	input.mango-->input with class mango
		
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Haaland jersey kids");
		
		driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
