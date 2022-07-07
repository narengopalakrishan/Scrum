package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TravellerPage {

	WebDriver driver5;

	public static WebElement getAdult1_title() {
		return adult1_title;
	}

	public static WebElement getAdult1_firstname() {
		return adult1_firstname;
	}

	public static WebElement getAdult1_lastname() {
		return adult1_lastname;
	}

	public TravellerPage(WebDriver driver) {
		this.driver5 = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[text()='CONTINUE']")
	private static WebElement continue_click;

	public static WebElement getContinue_click() {
		return continue_click;
	}

	@FindBy(xpath = "//select")
	private static WebElement adult1_title;

	@FindBy(xpath = "//input[@type='text'and@name='First Name and Middle Name']")
	private static WebElement adult1_firstname;

	@FindBy(xpath = "//input[@type='text'and@name='Last Name']")
	private static WebElement adult1_lastname;

	@FindBy(xpath = "//input[@type='text'and@name='Phone Number']")
	private static WebElement phno;

	@FindBy(xpath = "//input[@type='text'and@name='Email Address']")
	private static WebElement email;

	@FindBy(xpath = "//div[text()='Continue']")
	private static WebElement continue_button;

	public static WebElement getPhno() {
		return phno;
	}

	public static WebElement getEmail() {
		return email;
	}

	public static WebElement getContinue_button() {
		return continue_button;
	}

}
