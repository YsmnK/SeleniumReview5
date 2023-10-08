package com.neotech.review04;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class UploadExample extends CommonMethods{

	public static void main(String[] args) {
		
//https://neotech.vercel.app/fileUpload
		
		setUp();
	//file uploading	
	String filePath=System.getProperty("user.dir")+"/screenshots/Form/png";	
	driver.findElement(By.id("image_file")).sendKeys(filePath);
	
	
	driver.findElement(By.id("btnUpload")).click();
	
	//Let's wait for teh div with class"contactus" to be visible
	waitForVisibility(driver.findElement(By.cssSelector("div.ContactUs")));
	
	String expectedMessage="File uploaded succesfully!";
	String actualMessage=driver.findElement(By.id("upload_response")).getText();
	
	
		wait(2);
		
		
		tearDown();
	}

}
