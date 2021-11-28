package com.careerhack.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlashBase {
	public WebDriver driver;
	
	String browser = " chrome";
	
	public void launchBrowser() {
		
		if (browser == "chrome") {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); 
			
		} else if (browser == "firefox") {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
			else if (browser == "edge") {	
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} 
			else {
			System.out.println("Browser not found");
		}
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		
	}
	
	public void closeBrower() {
		driver.close();
	}
	
	public void closeAllBrowser() { 
		driver.quit();
	}
	

}
