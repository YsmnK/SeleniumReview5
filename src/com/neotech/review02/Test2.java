package com.neotech.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Test2 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Login to SIS Web Application
		 * http://neotechacademy-sis.com:9000/Test/
		 * username -> Admin
		 *  password -> Neotech$123
		 */
		
		setUp();
		
		String username=ConfigsReader.getProperty("username"); // read the property
		String password=ConfigsReader.getProperty("password");
		
		//method chainig only one line
		//driver.findElement((By.id("tUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("tUsername")).sendKeys(username);
		driver.findElement(By.id("tPassword")).sendKeys(password);
		driver.findElement(By.id("bLogin")).click();
		
		
		Thread.sleep(3000);
		tearDown();

	}

}
