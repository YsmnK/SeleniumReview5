package com.neotech.review04;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;

public class ScreenshotExample extends CommonMethods {

	public static void main(String[] args) {
		
		//https://www.facebook.com/
		
		setUp();
	
		wait(2);
		
		//taking the screenshot of the whole page
		//casting driver
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("screenshots/FacebookLogin.png");
		
		try {
			Files.copy(source, destination);
		} catch (IOException e) {
			System.out.println("Coudn't save the screenshot!");
			e.printStackTrace();
		}
		
		System.out.println("--------------------");
		
		//taking terh screenshot of a WebElkement [form]
		
		WebElement form=driver.findElement(By.xpath("//form[@data-testid='royal_login_form']"));
		
		//casting web element(form) not driver
		TakesScreenshot ts2=(TakesScreenshot) form;
		File source2=ts2.getScreenshotAs(OutputType.FILE);
		File destination2=new File("screenshots/Form.png");
		
		wait(2);
		try {
			Files.copy(source2, destination2);
		} catch (IOException e) {
			System.out.println("Coudn't save the screenshot!");
			e.printStackTrace();
		}
		
		tearDown();
	

	}

}
