package com.LogIn;

import org.openqa.selenium.WebDriver;

import com.Generic.ConfigClass;
import com.Generic.DriverClass;


public class LogInClass {
//	 WebDriver driver;
//	public void getLogIn(String browser) {
//		if(browser.equalsIgnoreCase("chrome")){
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//		}else if (browser.equalsIgnoreCase("firefox")) {
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//		}else {
//			System.out.println("Not found any browser");
//		}
//		driver.manage().window().maximize();
//		driver.navigate().to(ConfigClass.getConfigValue("QA_URL"));
//		MasterPageFactory mpf = new MasterPageFactory(driver);
//		mpf.getMainLogIn().click();
//	
//	}
	
	WebDriver driver;
	public void getLogIn() {
		DriverClass dr = new DriverClass(driver);
		driver= dr.getDriver("chrome");
		driver= dr.getDriver("firefox");
		driver.navigate().to(ConfigClass.getConfigValue("QA_URL"));
		//MasterPageFactory mpf = new MasterPageFactory(driver);
		//mpf.getMainLogIn().click();
	}

}
