package com.carrerhack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Objects {
	
	WebDriver driver;
	public HomePage_Objects(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	//WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
	//searchBox.sendKeys(string);
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchBox;
	
	public void enterTerm(String term) {
		searchBox.sendKeys(term);
	}
	
	//WebElement searchButton = driver.findElement(By.xpath("//input[@name='q']"));
	//searchButton.submit();
	
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchButton;
	
	
	{
		searchButton.submit();
	}

	
	
	
	
}
