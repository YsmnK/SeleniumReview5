package com.neotech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.BaseClass;

public class FileUploadPageElements extends BaseClass{
	
	//Without Page factory
	
	//WebElement filePathInput = driver.findElement(By.id("image_file"));
	
	//With page Factory
	
	@FindBy(id="image_file")
	public WebElement filePathInput;
	
	@FindBy(xpath="//input[@id='image_file']/following-sibling::span")
	public WebElement uploadBtn;
	
	@FindBy(css="dic.ContactUs")
	public WebElement contactDiv;
	
	@FindBy(className="css-0")
	public WebElement screenshotDiv;
	
	public FileUploadPageElements() {
		PageFactory.initElements(driver,this);//this means this class, we only use driver
		//because we extends to BaseClass, (otherwise ->BaseClass.driver,this,is going to be
	}

}
