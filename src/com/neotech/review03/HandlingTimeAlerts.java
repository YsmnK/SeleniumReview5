package com.neotech.review03;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class HandlingTimeAlerts extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// https://neotech.vercel.app/alerts
		
		setUp();
		
	WebElement alertBtn=driver.findElement(By.id("btnAlert"));
	alertBtn.click();
	Thread.sleep(1000);
		
	//Handling the Alert
	Alert al= driver.switchTo().alert();
	String alertText=al.getText();
	System.out.println("The text of the alert is: " +al.getText());
	al.accept();
	Thread.sleep(1000);
	
	//Handling the delay alert
		driver.findElement(By.id("btnDelayedAlert")).click();
		
		//org.openqa.selenium.NoAlertPresentException: no such alert
		//The alert is not present yet
		//al=driver.switchTo().alert();
		
		//This kind of waiting is not good
		//Because I dont wan tto wait for too long
		//Thread.sleep(10000); wait exactly 30 seconds
		//al=driver.switchTo().alert();
		//System.out.println("The text of the alert is:" +al.getText());
	//	al.accept();
	
		//I want to wait the alert to be present
		//wait for a maximum of 30 seconds
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));//maximum 30 seconds
		wait.until(ExpectedConditions.alertIsPresent());
	//	Thread.sleep(300);//put alert here to see how it set it , thread does not have any conditions
		
		
		//If the alert is present in 3 seconds , I will wait only 3 seconds
		
		al=driver.switchTo().alert();
		Thread.sleep(1000);// want to see the alert for 1 second 
		al.accept();
		Thread.sleep(1000); //want ot see trhe page after alert is closed
		
		
		tearDown();
		

	}

}
