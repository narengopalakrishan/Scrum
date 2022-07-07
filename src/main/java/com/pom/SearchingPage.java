package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchingPage {

	WebDriver driver2;

	public SearchingPage(WebDriver driver) {
		this.driver2 = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[text()='Round Trip']")
	private static WebElement roundTrip;

	public static WebElement getRoundTrip() {
		return roundTrip;
	}

	@FindBy(xpath = "(//input[@type='text'])[position()=1]")
	private static WebElement from;

	public static WebElement getFrom() {
		return from;
	}

	@FindBy(xpath = "((//input[@type='text'])[position()=1])//following::div[text()='BOM'][1]")
	private static WebElement from_full;

	public static WebElement getFrom_full() {
		return from_full;
	}

	@FindBy(xpath = "(//input[@type='text'])[position()=2]")
	private static WebElement to;

	public static WebElement getTo() {
		return to;
	}

	@FindBy(xpath = "(//input[@type='text'])[position()=2]//following::div[text()='BLR']")
	private static WebElement to_full;

	public static WebElement getTo_full() {
		return to_full;
	}

	@FindBy(xpath = "(//input[@type='text'])[position()=3]")
	private static WebElement departDate;

	public static WebElement getDepartDate() {
		return departDate;
	}

	public static WebElement getDepart_full() {
		return depart_full;
	}

	public static WebElement getReturndate() {
		return returndate;
	}

	public static WebElement getReturn_full() {
		return return_full;
	}

	@FindBy(xpath = "(//tr[3]//td[7])[position()=1]")
	private static WebElement depart_full;

	@FindBy(xpath = "(//input[@type='text'])[position()=4]")
	private static WebElement returndate;

	@FindBy(xpath = "((//tr[3])[position()=2])//td[2]")
	private static WebElement return_full;
	
	
	@FindBy (xpath = "(//input[@type='text'])[position()=5]")
	private static WebElement Traveller_class;
	
	@FindBy (xpath = "(//button)[position()=2]")
	private static WebElement adults;
	
	@FindBy (xpath = "(//button)[position()=4]")
	private static WebElement childrens;
	
	@FindBy (xpath = "(//button)[position()=6]")
	private static WebElement infants;
	
	@FindBy (xpath = "//span[text()='SEARCH']")
	private static WebElement search;

	public static WebElement getSearch() {
		return search;
	}

	public static WebElement getTraveller_class() {
		return Traveller_class;
	}

	public static WebElement getAdults() {
		return adults;
	}

	public static WebElement getChildrens() {
		return childrens;
	}

	public static WebElement getInfants() {
		return infants;
	}
	
	
}
