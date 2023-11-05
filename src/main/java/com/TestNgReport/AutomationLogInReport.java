package com.TestNgReport;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Generic.ConfigClass;
import com.Generic.DriverClass;
import com.Generic.MasterPageFactory;
import com.Util.HighLighter;
import com.Util.ScreenShot;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class AutomationLogInReport {

	WebDriver driver;

	ExtentReports extent;
	ExtentTest test;

	@BeforeTest
	public void setupReport() {

		ExtentHtmlReporter reporter = new ExtentHtmlReporter("target/AutomationLogIn.html");
		reporter.config().setDocumentTitle("Testng Automation");
		reporter.config().setReportName("Smoke test");
		reporter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Company ", "SMART TECH");
		extent.setSystemInfo("Testing environment ", "QA");
		extent.setSystemInfo("Team ", "QA");
		extent.setSystemInfo("Tester Name: ", System.getProperty("user.name"));


	}

	@Test(priority = 1, groups = { "Smoke" })
	public void getUrl() {
		DriverClass dr = new DriverClass();
		driver = dr.getDriver2(driver);
		driver.navigate().to(ConfigClass.getConfigValue("QA_URL"));
	}

	@Test(priority = 2, groups = { "Smoke" })
	public void getHomePageLogIn() {
		MasterPageFactory mpf = new MasterPageFactory(driver);
		HighLighter.addColor(driver, mpf.getMainLogIn());// Highlight
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		mpf.getMainLogIn().click();
		ScreenShot.getScreenShot(driver, "Homepage_AfterLogin");
		HighLighter.addColor2(driver, mpf.getLogInWithEmail());
		mpf.getLogInWithEmail().sendKeys(ConfigClass.getConfigValue("QA_Email"));
		ScreenShot.getScreenShot(driver, "Valid_email");
		HighLighter.addColor2(driver, mpf.getLOgInWithPassword());
		mpf.getLOgInWithPassword().sendKeys(ConfigClass.getConfigValue("QA_Password"));
		ScreenShot.getScreenShot(driver, "ValidPassword");
		HighLighter.addColor(driver, mpf.getSubmitLogIn());
		mpf.getSubmitLogIn().click();
	}

	@Test(priority = 3, groups = { "Smoke" })
	public void getLogOut() {
		MasterPageFactory mpf = new MasterPageFactory(driver);
		mpf.getLogOutBtn().click();
		
		test = extent.createTest("Automation Log In");

	}
	@AfterTest
	public void printTestReprot() {
		extent.flush();
	}
}
