package com.LogIn;

import org.openqa.selenium.WebDriver;

import com.Generic.ConfigClass;
import com.Generic.CrossBrowserDriver;
import com.Generic.MasterPageFactory;


public class LogInWithCrossBrowser {
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
		
		CrossBrowserDriver dr = new CrossBrowserDriver(driver);
		driver= dr.getDriver("chrome");
		driver.navigate().to(ConfigClass.getConfigValue("QA_URL"));
		MasterPageFactory mpf = new MasterPageFactory(driver);
		mpf.getMainLogIn().click();
		driver= dr.getDriver("firefox");
		driver.navigate().to(ConfigClass.getConfigValue("QA_URL"));
		mpf.getMainLogIn().click();
		mpf.getLogInWithEmail().sendKeys("QA_Email");
	}

}
