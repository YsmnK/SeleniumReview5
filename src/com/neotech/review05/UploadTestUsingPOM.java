package com.neotech.review05;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.neotech.pages.FileUploadPageElements;
import com.neotech.utils.CommonMethods;

public class UploadTestUsingPOM extends CommonMethods{
	
public static void main(String[] args) {
	//https://neotech.vercel.app/fileUpload
	
	setUp();
	
	FileUploadPageElements fileUp=new FileUploadPageElements();
	
	//String filePath = "/Users/limanaj/Downloads/Ensar.png";
	  String filePath ="/This PC/Downloads/image.png";
	fileUp.filePathInput.sendKeys(filePath);
	//sendText(fileUp.filePathInput,filePath);
	wait(5);
	
	fileUp.uploadBtn.click();
	click(fileUp.uploadBtn);
	
	String expectedText = "File uploaded successfully!";
	
	waitForVisibility(fileUp.contactDiv);
	
	String actualText=fileUp.contactDiv.getText();
	
	String destination = "screenshots";
	if (actualText.equals(expectedText)) {
		destination += "/passed/image.png";
	} else {
		destination += "/failed/image.png";
	}
	
	TakesScreenshot ts=(TakesScreenshot) fileUp.screenshotDiv;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File(destination);

	try {
		Files.copy(src, dest);
	} catch (IOException e) {
		e.printStackTrace();
	}

	wait(1);
	
	
	
	tearDown();
	
}
	
		

	}


