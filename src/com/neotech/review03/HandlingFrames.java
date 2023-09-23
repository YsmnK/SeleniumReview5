package com.neotech.review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class HandlingFrames extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		// https://the-internet.herokuapp.com/iframe
		
		setUp();
		
		//1st way switcing by index
		//2.nd way is switching by id or name
		//3rd way switching by webElement
		//driver.switchTo().frame(0); //by index
		//driver.switchTo().frame("mce_0_ifr");//by Id
		WebElement frameElement=driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
	    driver.switchTo().frame(frameElement);
	  
	    WebElement bodyElement=driver.findElement(By.xpath("//body[@id='tinymce']"));
	    bodyElement.clear();
	    bodyElement.sendKeys("AC Milan is better than Inter");
	Thread.sleep(3000);
	
	    //this will throw an exception No suchElementException
	    //because the focus is inside the frame
	    //but the element is outside of the frame
	   // driver.findElement(By.linkText("Elemental Selenium")).click();
	    
	    //we have to switch to focus main page
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Elemental Selenium")).click();
		Thread.sleep(3000);
		
		tearDown();

	}

}
