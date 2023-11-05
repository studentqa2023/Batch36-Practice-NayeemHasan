package com.LogIn;

import org.openqa.selenium.WebDriver;

import com.Generic.ConfigClass;
import com.Generic.DriverClass;
import com.Generic.MasterPageFactory;
import com.Util.HighLighter;
import com.Util.ScreenShot;

public class ProductClass {
	WebDriver driver;
	public void getProduct() {
		DriverClass dr = new DriverClass();
		driver= dr.getDriver2(driver);
		driver.navigate().to(ConfigClass.getConfigValue("QA_URL"));
		MasterPageFactory mpf = new MasterPageFactory(driver);
		HighLighter.addColor(driver, mpf.getMainLogIn());//Highlight
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		mpf.getMainLogIn().click();
		ScreenShot.getScreenShot(driver, "Homepage_AfterLogin");
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("mpf.getCostcoLogInWithEmail()")));
		HighLighter.addColor2(driver, mpf.getLogInWithEmail());
		mpf.getLogInWithEmail().sendKeys(ConfigClass.getConfigValue("QA_Email"));
		ScreenShot.getScreenShot(driver, "Valid_email");
		HighLighter.addColor2(driver, mpf.getLOgInWithPassword());
		mpf.getLOgInWithPassword().sendKeys(ConfigClass.getConfigValue("QA_Password"));
		ScreenShot.getScreenShot(driver, "ValidPassword");
		HighLighter.addColor(driver, mpf.getSubmitLogIn());
		mpf.getSubmitLogIn().click();
		HighLighter.addColor2(driver, mpf.getProductBtn());
		mpf.getProductBtn().click();
		ScreenShot.getScreenShot(driver, "Product_InMainPage");
		
	}

}
