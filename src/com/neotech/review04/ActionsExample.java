package com.neotech.review04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

public class ActionsExample extends CommonMethods {

	public static void main(String[] args) {

		// http://webdriveruniversity.com/Actions/index.html

		setUp();

		Actions act = new Actions(driver);

		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		act.dragAndDrop(draggable, droppable).perform();
		// Don't forget the perform() at the end

		act.clickAndHold(draggable).moveToElement(droppable).pause(1000).release().perform();

		// Double Click

		WebElement dblClickButton = driver.findElement(By.id("double-click"));

		// does clicking 2 times work ?--no
		dblClickButton.click();
		dblClickButton.click();

		act.doubleClick(dblClickButton).perform();

		// Mouse Hover (3 l3m3nt inside the location and needs list)

		List<WebElement> hoverButtons = driver.findElements(By.cssSelector("button.dropbtn"));

		for (WebElement hover : hoverButtons) {
			act.moveToElement(hover).perform();
		}
		// Clicking and Holding element

		WebElement div = driver.findElement(By.id("click-box"));
		act.click(div).pause(2000).release().pause(1000).clickAndHold(div).pause(1000).perform();

		wait(2);

		tearDown();

	}

}
