package com.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[contains(text(),'Login')] ")//AE
	private WebElement MainLogIn;
	@FindBy(xpath="(//input[@name='email'])[1]")//AE
	private WebElement LogInWithEmail;
	@FindBy(xpath="//*[@type='password']")//AE
	private WebElement LOgInWithPassword;
	@FindBy(xpath="(//*[@type='submit'])[1]")//AE
	private WebElement SubmitLogIn;
	@FindBy(xpath="//*[contains(text(), ' Logout')]")//AE
	private WebElement LogOutBtn;
	@FindBy(xpath="(//*[contains(text(), ' Cart')])[1]")
	private WebElement CartBtn;
	@FindBy(xpath="//*[contains(text(), ' Products')]")
	private WebElement ProductBtn;
	@FindBy(xpath="(//*[contains(text(), 'Register')])[1]")//costco
	private WebElement CostcoLogIn;
	@FindBy(xpath="//*[@type='text']")//costco
	private WebElement CostcoLogInWithEmail;
	
	public WebElement getProductBtn() {
		return ProductBtn;
	}
	
	public WebElement getCartBtn() {
		return CartBtn;
	}

	
	public WebElement getLogOutBtn() {
		return LogOutBtn;
	}
	
	public WebElement getSubmitLogIn() {
		return SubmitLogIn;
	}
	
	public WebElement getLOgInWithPassword() {
		return LOgInWithPassword;
	}

	public WebElement getCostcoLogInWithEmail() {
		return CostcoLogInWithEmail;
	}

	public WebElement getCostcoLogIn() {
		return CostcoLogIn;
	}

	public WebElement getLogInWithEmail() {
		return LogInWithEmail;
	}

	public WebElement getMainLogIn() {
		return MainLogIn;
	}


}
