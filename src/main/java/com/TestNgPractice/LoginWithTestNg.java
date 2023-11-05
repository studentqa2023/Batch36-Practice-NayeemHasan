package com.TestNgPractice;

import org.testng.annotations.Test;

public class LoginWithTestNg {
	@Test(priority=0,groups= {"Smoke","Regrassion"})
	public void login() {
		System.out.println("This is login method");
	}
	@Test(priority=1,groups= {"Regrassion"},dependsOnMethods="login")
	public void dress() {
		System.out.println("This is dress method");
	}
	@Test(priority=2,groups= {"Regrassion"})
	public void cart() {
		System.out.println("This is cart method");
	}
	@Test(priority=3,groups= {"Smoke"})
	public void payment() {
		System.out.println("This is payment method");
	}
	@Test(priority=4,groups= {"Smoke"})
	public void placeorder() {
		System.out.println("This is place order method");
	}
	

	

}
