package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;
	
	//1.  Locators
	
	private By settingsIcon=By.xpath("(//i[@class='settings icon'])[1]");
	
	
	
	
	
	//2. Constructor
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	//3. Page Actions
	
	public String HomePageTitle() {
		return driver.getTitle();
		
	}

	
	public void selectSettingsIcon() {
		driver.findElement(settingsIcon).click();
		
	}


	
	
	
	
	
	
	
}
