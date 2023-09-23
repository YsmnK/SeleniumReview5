package com.neotech.review03;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Task1 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// https://neotech.vercel.app/windows
        //Click on the button that open the page
		//Switch the focus back and forth 10 imes
		//Hint: you switch the handles that you have in the set
		
	setUp();
	
	driver.findElement(By.id("neo")).click();
	
	Set <String> allHandles=driver.getWindowHandles();
	
	Iterator<String> it =allHandles.iterator();
	String handle1=it.next();
	String handle2=it.next();
	
	for(int i=0;i<10;i++) {
		driver.switchTo().window(handle1);
		Thread.sleep(400);
		driver.switchTo().window(handle2);
		Thread.sleep(400);
	}
	driver.close();
	
	
	tearDown();
		
	}

}
