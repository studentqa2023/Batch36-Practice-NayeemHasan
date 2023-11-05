package com.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {
	public WebDriver getHeadLessBrowser(WebDriver driver) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ghost = new ChromeOptions();
		ghost.addArguments("--headless");
		driver = new ChromeDriver(ghost);
		driver.manage().window().maximize();
		return driver;
	}

}
