package com.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZoomInZoomOutInSelenium {

	WebDriver driver;

	@Test
	public void zoomInZoomOutInSelenium() throws InterruptedException {
		// First step set the driver location
		// For Window user
		// System.setProperty("webdriver.chrome.driver", "C://Users//91939//drivers//chromedriver.exe.exe");
				
		System.setProperty("webdriver.chrome.driver", "C://Users//91939//drivers//chromedriver.exe");
		// create driver object	
		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		// zoom out by 40%
		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='40%'");
		
		Thread.sleep(3000);
		// zoom out by 100%
		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='100%'");
		
	}
}
