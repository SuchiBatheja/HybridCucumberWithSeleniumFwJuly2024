package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
		private WebDriver driver;

	//1. By Locators :OR
	
	private By EmailId = By.xpath("//input[@name='email']");
	private By Password=By.xpath("//input[@name='password']");
	private By LoginBtn=By.xpath("//div[@class='ui fluid large blue submit button']");
	private By ForgotPasswordLink = By.linkText("Forgot your password?");
	
	//2. Constructor
	
	public LoginPage(WebDriver driver) {
		 
		this.driver=driver;
		
	}
	
	//3. Page Actions : Features
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean isForgotPasswordExists() {
		return driver.findElement(ForgotPasswordLink).isDisplayed();
	}
	
	public void enterUserName(String userName) {
		driver.findElement(EmailId).sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		driver.findElement(Password).sendKeys(password);
	}
	
	public void clickLoginButton() {
		driver.findElement(LoginBtn).click();
	}
	
	public HomePage doLogin(String un, String pwd) {
		System.out.println("Login with username and password ");
		driver.findElement(EmailId).sendKeys(un);
		driver.findElement(Password).sendKeys(pwd);
		driver.findElement(LoginBtn).click();
		return new HomePage(driver);
		
	}
	
	
	
	
}
