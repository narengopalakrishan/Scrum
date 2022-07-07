package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightPage {

	WebDriver driver3;

	public FlightPage(WebDriver driver) {
		this.driver3 = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath = "//div[text()='Non-stop']")
	private static WebElement non_stop;
	@FindBy (xpath = "(//label[@class='_2iDkf8 _1tyQUb'])[6]")
	private static WebElement time;
	@FindBy (xpath = "(//div[text()='GO FIRST'])[position()=1]")
	private static WebElement airline;
	
	@FindBy (xpath = "//span[text()='Book']")
	private static WebElement book;

	public static WebElement getBook() {
		return book;
	}
	public static WebElement getNon_stop() {
		return non_stop;
	}
	public static WebElement getTime() {
		return time;
	}
	public static WebElement getAirline() {
		return airline;
	}
}
