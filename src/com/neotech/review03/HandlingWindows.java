package com.neotech.review03;

import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class HandlingWindows extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		// https://neotech.vercel.app/windows

		setUp();
		
		String window1=driver.getWindowHandle();
		System.out.println(window1);
		
		driver.findElement(By.id("google")).click();
		Thread.sleep(1000);
		
		System.out.println("........................");
		
		//I am not able  to locate elements.The focus is still on the same page
		//driver.findElement(By.name("q")).sendKeys("hello");
		
		Set<String> allWindows=driver.getWindowHandles();//all window id is unique use set of string
		
		for(String windowId: allWindows) {
			System.out.println(windowId);
			if(!windowId.equals(window1)) {
				//if  the windowId is not equal to the first window Id
				driver.switchTo().window(windowId);
			}
		}
		//Now, I am able to locate elements.The fosuc is on teh second page
		driver.findElement(By.name("q")).sendKeys("hello");
		Thread.sleep(2000);
		tearDown();
	}

}
