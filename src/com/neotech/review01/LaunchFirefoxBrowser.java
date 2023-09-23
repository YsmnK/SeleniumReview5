package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String url = "https://www.nytimes.com/games/wordle/";
		driver.get(url);

		Thread.sleep(2000);

		String currentUrl = driver.getCurrentUrl();

		if (url.equals(currentUrl)) {
			System.out.println("Urls are the same");
		} else {
			System.out.println("Urls are different");
		}
		System.out.println(url);
		System.out.println(currentUrl);

		String title = driver.getTitle();

		System.out.println("title--> " + title);
		driver.quit();

	}

}
