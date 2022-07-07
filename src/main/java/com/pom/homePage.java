package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

	public WebDriver driver1;

	public homePage(WebDriver driver) {
		this.driver1 = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath = "//img[@alt='Travel']") private static WebElement travel;

	public static WebElement getTravel() {
		return travel;
	} 
	
	@FindBy (xpath = "//button[@class='_2KpZ6l _2doB4z']") private static WebElement close;

	public static WebElement getClose() {
		return close;
	}
	
}
