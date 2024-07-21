package com.qa.factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;

	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	
	/**
	 * This method is used to initiliaze the Threadlocal driver on the basis of 
	 * given browser
	 * @param browser
	 * @return this will return tlDriver
	 */

	public WebDriver init_driver(String browser) {

		System.out.println("browser value is : " + browser);

		if (browser.equals("chrome")) {

			WebDriverManager.chromedriver().setup();

			tlDriver.set(new ChromeDriver());

		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());

		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			tlDriver.set(new EdgeDriver());

		} else {

			System.out.println("please enter the correct browser value : " + browser);
		}
		
		getDriver().manage().deleteAllCookies();
		
		getDriver().manage().window().maximize();
		
		//getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		
		return getDriver();

	}
	
	/**
	 * This is used to return the driver with ThreadLocal
	 * @return current driver instance
	 */
	
	
	public static synchronized WebDriver getDriver() {
		
	
		return tlDriver.get();
		
	}
	
	
	

}
