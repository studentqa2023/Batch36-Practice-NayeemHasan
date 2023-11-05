package com.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserDriver {
	WebDriver driver;
	public CrossBrowserDriver(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}
	public WebDriver getDriver(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			}else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}else {
		System.out.println("Not found any driver");
			}
		driver.manage().window().maximize();
		return driver;
		}

}
