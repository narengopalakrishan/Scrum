package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver4;
	
	public LoginPage(WebDriver driver) {
		this.driver4= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "(//input[@type='text'])[position()=1]")
	private static WebElement username;
	
	public static WebElement getUsername() {
		return username;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getSubmit() {
		return submit;
	}

	@FindBy (xpath = "(//input[@type='password'])")
	private static WebElement password;
	
	@FindBy (xpath = "//button[@type='submit']")
	private static WebElement submit;
	
}
