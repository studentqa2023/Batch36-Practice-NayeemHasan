package com.LogIn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Generic.ConfigClass;
import com.Generic.DriverClass2;
import com.Generic.MasterPageFactory;

public class LogInClass2 {
	WebDriver driver;
	public void getLogIn2() {
	DriverClass2 dr = new DriverClass2();
	driver= dr.getDriver2(driver);
	driver.navigate().to(ConfigClass.getConfigValue("QA_URL"));
	MasterPageFactory mpf = new MasterPageFactory(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.elementToBeClickable(By.id("mpf.getMainLogIn()")));
	mpf.getMainLogIn().click();
	}
	
	
	
	

}
