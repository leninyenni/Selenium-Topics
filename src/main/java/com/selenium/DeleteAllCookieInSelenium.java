package com.selenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteAllCookieInSelenium {

	WebDriver driver;
	
	@Test
	public void deleteAllCookieInSelenium()
	{
		// First step set the driver location
		// For Window user
		// System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver_win32//chromedriver.exe.exe");
		
		System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver_win32//chromedriver.exe");
		// create chrome object	
		driver = new ChromeDriver();
		driver.navigate().to("http://flipkart.com/");
		driver.manage().deleteAllCookies();
        // After adding the cookie we will check that by displaying all the cookies.
		Set<Cookie> cookiesList =  driver.manage().getCookies();
		for(Cookie getcookies :cookiesList) {
		    System.out.println(getcookies );
		}
	}
}
