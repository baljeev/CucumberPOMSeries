package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	
	//1.By Locators
	By emailId =By.id("email");
	By passWord =By.id("passwd");
	By signinButton = By.id("SubmitLogin");
	By forgotpasswordLink = By.linkText("Forgot your password?");
	
	//2.Constructor of the Login Page class
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	//3.Page Actions 
	
	public String  getLoginPageTitle() {
		
		return driver.getTitle();

	}
	public boolean forgotPasswordLink() {
		return driver.findElement(forgotpasswordLink).isDisplayed();
		
	}
	public void enterUserName(String uname) {
		driver.findElement(emailId).sendKeys(uname);
	}
	public void enterPassword(String pwd) {
		driver.findElement(passWord).sendKeys(pwd);
	}
	public void clickonSignin() {
		driver.findElement(signinButton).click();
		
	}
	public AccountsPage doLogin(String Uname,String password) {
		driver.findElement(emailId).sendKeys(Uname);
		driver.findElement(passWord).sendKeys(password);
		driver.findElement(signinButton).click();
		return new AccountsPage(driver);
	}
	
	
	

}
