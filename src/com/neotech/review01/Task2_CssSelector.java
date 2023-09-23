package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_CssSelector {

	public static void main(String[] args) throws InterruptedException {
		
		// Go to https://demoqa.com/text-box
		// Fill the form and submit
		// Use xPath or CSS Selector

				System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

				WebDriver driver = new ChromeDriver();

				String url = "https://demoqa.com/text-box";

				driver.get(url);

				driver.findElement(By.cssSelector("input#userName")).sendKeys("Yasemin");
				
				driver.findElement(By.cssSelector("input[type='email'")).sendKeys("yasemin.k@gmail.com");
				
				// Even though there are 2 elements, we will get the first one
				//"textarea.form-control"
				
				driver.findElement(By.cssSelector("textarea[id='currentAddress']")).sendKeys("BaldwinPark , Florida");
				
				// Find an elements by using multiple attributes
				// CSS -> A textarea with class='form-control' AND id='currentAddress'
				// xPath -> //textarea[@class='form-control' and @id='currentAddress']
				
				driver.findElement(By.cssSelector("textarea#permanentAddress")).sendKeys("BaldwinPark , Florida");
				
				Thread.sleep(2000);
				
				driver.findElement(By.cssSelector("button#submit")).click();
				
				Thread.sleep(2000);
				
				driver.quit();
	}

}
