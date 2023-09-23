package com.neotech.review03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WebTableExample extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
	//	url=https://neotech.vercel.app/tables
		
		setUp();
		
		//Find the number of rows
		List <WebElement> rows=driver.findElements(By.xpath("//table/tbody/tr"));
		
		System.out.println("The number of rows are : "+ rows.size());
		
		//Find the number of the columns in the first row
		List <WebElement> cols=driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		
		System.out.println("The number of cols are : "+ cols.size());
		
		//Find the number of all the cells in the table
		List <WebElement>cells=driver.findElements(By.xpath("//table/tbody/tr/td"));
		System.out.println("The number of cells are : "+ cells.size());
		
	System.out.println(".............");
	
	//If I want to print the first row of the table
	//1st way, Static way, getting then data from the first row.
	
	List <WebElement>firstRowList=driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
	
	for(WebElement el :firstRowList) {
		System.out.print(el.getText()+"|");
	}
	System.out.println();
	System.out.println("..................");
	
	//2nd way Dynamic way ,
	
	for(int i=1;i<cols.size();i++) {
		String path="//table/tbody/tr[1]/td[" + i + "]";
	WebElement cell=driver.findElement(By.xpath(path));//concatanete td cells
	System.out.print(cell.getText()+ "|");
	
	}
	System.out.println();
	
	System.out.println("................");
	System.out.println("Let us print all the cells of all the rows");
	System.out.println("..................");
	
	for(int row=1;row<=rows.size();row++) { // iterating the row
		
	for(int col=1;col<=4;col++) { // iterating the col
//		String path="//table/tbody/tr[" + row + "]/td[" + col + "]";
//		System.out.println(path);
		
		WebElement element = driver.findElement(By.xpath("//table/tbody/tr[" + row + "]/td[" + col + "]"));
		System.out.println(element.getText());
	}
	System.out.println();
	}
	
	Thread.sleep(1000);
	
		tearDown();
		
		 
		
	}

}
