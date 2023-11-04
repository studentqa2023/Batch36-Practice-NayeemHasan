package com.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getMainLogIn() {
		return MainLogIn;
	}


	@FindBy(xpath="//i[@class='fa fa-home']")
	private WebElement MainLogIn;

}
