package com.runner_class;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.base.Base_class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/feature", 
glue = "com/stepdefinition", 
plugin = { "pretty","html:target/htmlreport/searching_flights.html" }, 
monochrome = true, 
dryRun = false
//tags = ("@smoke")
)

public class RunnerClass {

	@BeforeClass
	public static void launching_brow() {
		System.out.println("Broswer will open soon");
		Base_class.chrome_open(30);
	}

	@AfterClass
	public static void closing_broswer() {
		System.out.println("Broswer will close soon");
		Base_class.close_or_quit("quit");
	}

}
