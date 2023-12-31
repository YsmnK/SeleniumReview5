package com.neotech.review02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class HarryPotterSearch extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Go to https://amazon.com select books from the search dropdown type Harry
		 * potter and click on Search check "Kindle Unlimited Eligible" checkbox on the
		 * left
		 */

		setUp();

		WebElement dd = driver.findElement(By.id("searchDropdownBox"));
		
		Thread.sleep(2000);

		Select book = new Select(dd);
		book.selectByVisibleText("Books");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Harry potter");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"p_n_feature_twenty_browse-bin/13054657011\"]/span/a/div/label "))
				.click();
		
		Thread.sleep(3000);
		
		List<WebElement> elementList = driver.findElements(By.xpath("//li[@class='a-spacing-micro']"));
		
		System.out.println("There are -> " + elementList.size() + " <- elements with that xPath");
	
		// This exception is a nightmare -> StaleElementReferenceException
				// Happens when we click, and don't break the loop
				for (WebElement el : elementList) {
					String elementText = el.getText();
					
					if (elementText.equals("Kindle Unlimited Eligible")) {
						el.click();
						break;
					}}
		tearDown();

	}

}
