package com.neotech.review03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Task2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		//https://the-internet.herokuapp.com/tables
		
		
		// Go to https://the-internet.herokuapp.com/tables
		// I want you to print all the data from the tbody of the second table
		// Create the path dynamically
		// Don't print the last column
		setUp();
		
	List <WebElement> rows= driver.findElements(By.xpath("//table[@id='table2']/tbody/tr"));  	
	System.out.println(rows.size());
	List<WebElement> cols=driver.findElements(By.xpath("//table[@id='table2']/tbody/tr[1]/td")); // tr[1] , the others rowa are the same
	System.out.println(cols.size());
	
	for(int row=1;row<=rows.size();row++) {
		for(int col=1;col<cols.size();col++) {
			
			//	String path="//table/tbody/tr[" + row +" ]/td[" + col+ "]";
					
			WebElement element=driver.findElement(By.xpath("//table[@id='table2']/tbody/tr[" + row + " ]/td[" + col+ "]"));
			System.out.print(element.getText() + " |");
		}
		System.out.println();
	}
	// 2nd way
	
	// I want to print all the data from the second table
//			int rows = driver.findElements(By.xpath("//table[@id='table2']/tbody/tr")).size();
//			int cols = driver.findElements(By.xpath("//table[@id='table2']/tbody/tr[1]/td")).size();
//	​
//			for (int i = 1; i <= rows; i++) {
//				// iterating the rows
//	​
//				for (int j = 1; j < cols; j++) { // skipping the last column
//					// iterating the columns
//	​
//					WebElement el = driver.findElement(By.xpath("//table[@id='table2']/tbody/tr[" + i + "]/td[" + j + "]"));
//					System.out.print(el.getText() + " | ");
//				}
//				System.out.println();
	//}
	
	//3.rd way
	//List <WebElement> table2=driver.findElement(By.xpath("//*[@id=\"table2\"]/tbody"));
	//for (int row=1;row<=4;row++){
	//for(int col=1;col<=5;col++)}{
	//WebElement el=driver.findElement(By.xpath("//*[@id=\"table2\"]/tbody"/tr["+row+")/td["+col+"]"))
	//System.out.println(el.get.Text());
	//}
	//}
	Thread.sleep(1000);
		
		tearDown();
		
	}

}
