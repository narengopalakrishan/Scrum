package com.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Base_class;
import com.helper.FileReadManager;
import com.pom.FlightPage;
import com.pom.LoginPage;
import com.pom.SearchingPage;
import com.pom.TravellerPage;
import com.pom.homePage;

import io.cucumber.java.*;
import io.cucumber.java.en.*;

public class Stepdefinition_searchingFlight {

	homePage page1;
	SearchingPage page2;
	FlightPage page3;
	LoginPage page4;
	TravellerPage page5;
	Select s1;
	Select s2;
	

	@Before
	public void beforeHooks(Scenario scenario) {
		String Scenario_name = scenario.getName();
		System.out.println("Scenario name: " + Scenario_name);
	}

	@After
	public void afterHooks(Scenario scenario) {
		Status scenario_status = scenario.getStatus();
		System.out.println("Scenario status: " + scenario_status);
		if (scenario.isFailed()) {
			TakesScreenshot ss = (TakesScreenshot) Base_class.driver;
			File screenshotAs = ss.getScreenshotAs(OutputType.FILE);
			File file = new File("./ScreenShot/error_img.png");
			try {
				FileHandler.copy(screenshotAs, file);
			} catch (IOException e) {
				e.printStackTrace();
			}
			;
		}
	}

	@Given("Pass the url")
	public void pass_the_url() throws IOException {
		String passing_URL = FileReadManager.getInstance().Configreader().passing_URL();
		Base_class.driver.get(passing_URL);

	}

	@When("User click the travel option")
	public void user_click_the_travel_option() {
		page1 = new homePage(Base_class.driver);
		homePage.getClose().click();
		WebElement travel = homePage.getTravel();
		WebDriverWait wait = new WebDriverWait(Base_class.driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(travel));
		travel.click();
	}

	@Given("User select the round trip")
	public void user_select_the_round_trip() throws InterruptedException {
		page2 = new SearchingPage(Base_class.driver);
		SearchingPage.getRoundTrip().click();
	}

	@When("User enter From and To location")
	public void user_enter_from_and_to_location() throws IOException, InterruptedException {
		String fromLocation = FileReadManager.getInstance().Configreader().fromLocation();
		SearchingPage.getFrom().sendKeys(fromLocation);
		Thread.sleep(1000);
		SearchingPage.getFrom_full().click();
		String To_location = FileReadManager.getInstance().Configreader().toLocation();
		SearchingPage.getTo().sendKeys(To_location);
		SearchingPage.getTo_full().click();
	}

	@When("user enter the depart date and return date")
	public void user_enter_the_depart_date_and_return_date() {
		SearchingPage.getDepartDate().click();
		SearchingPage.getDepart_full().click();
		SearchingPage.getReturndate().click();
		SearchingPage.getReturn_full().click();
	}

	@When("user enter the traveller and class details")
	public void user_enter_the_traveller_and_class_details() {
		SearchingPage.getTraveller_class().click();
//		SearchingPage.getAdults().click();
//		SearchingPage.getChildrens().click();
//		SearchingPage.getInfants().click();
		SearchingPage.getSearch().click();
	}

	@When("User select the non-stop option")
	public void user_select_the_non_stop_option() {
		page3 = new FlightPage(Base_class.driver);
		FlightPage.getNon_stop().click();
	}

	@When("User select Departure time option")
	public void user_select_departure_time_option() throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(Base_class.driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.elementToBeSelected(FlightPage.getTime()));
//		FlightPage.getTime().click();
		JavascriptExecutor js = (JavascriptExecutor) Base_class.driver;
		js.executeScript("arguments[0].click()", FlightPage.getTime());
	}

	@When("user select the airline")
	public void user_select_the_airline() {
		JavascriptExecutor js = (JavascriptExecutor) Base_class.driver;
		js.executeScript("arguments[0].click()", FlightPage.getAirline());
	}

	@When("user book the flight")
	public void user_book_the_flight() {
		FlightPage.getBook().click();
	}

	@When("user enter the valid username and password")
	public void user_enter_the_valid_username_and_password() throws IOException {
		page4 = new LoginPage(Base_class.driver);
		String username = FileReadManager.getInstance().Configreader().username();
		LoginPage.getUsername().sendKeys(username);
		String password = FileReadManager.getInstance().Configreader().password();
		LoginPage.getPassword().sendKeys(password);
		LoginPage.getSubmit().click();
	}

	@When("user check the intinerary and click the continue")
	public void user_check_the_intinerary_and_click_the_continue() {
		page5 = new TravellerPage(Base_class.driver);
		TravellerPage.getContinue_click().click();
	}

	@When("user enter the traveller name and DOB")
	public void user_enter_the_traveller_name_and_dob() {
		WebElement adult1_title = TravellerPage.getAdult1_title();
		s1 = new Select(adult1_title);
		s1.selectByVisibleText("Mr");
		TravellerPage.getAdult1_firstname().sendKeys("Naren");
		TravellerPage.getAdult1_lastname().sendKeys("G");
	}

	@When("user enter the contact info")
	public void user_enter_the_contact_info() {
		TravellerPage.getPhno().sendKeys("9876543217");
		TravellerPage.getEmail().sendKeys("abcd@gmail.com");
	}

	@When("user click the continue")
	public void user_click_the_continue() {
		TravellerPage.getContinue_button().click();
	}

}
