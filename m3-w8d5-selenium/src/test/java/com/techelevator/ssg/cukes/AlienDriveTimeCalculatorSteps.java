package com.techelevator.ssg.cukes;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techelevator.ssg.pageobject.DriveTimeCalculatorInputPage;
import com.techelevator.ssg.pageobject.DriveTimeCalculatorResultsPage;
import com.techelevator.ssg.pageobject.HomePage;
import com.techelevator.ssg.pageobject.WeightCalculatorInputPage;
import com.techelevator.ssg.pageobject.WeightCalculatorResultsPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


@Component
public class AlienDriveTimeCalculatorSteps {
	private WebDriver webDriver;
	private HomePage homePage;
	private DriveTimeCalculatorInputPage driveTimeInput;
	private DriveTimeCalculatorResultsPage driveTimeResult;

	@Autowired
	public AlienDriveTimeCalculatorSteps(WebDriver webDriver) {
		this.webDriver = webDriver;
		homePage = new HomePage(webDriver);
		driveTimeInput = new DriveTimeCalculatorInputPage(webDriver);
		driveTimeResult = new DriveTimeCalculatorResultsPage(webDriver);
	}

	@Given("^I am on the drive time calculator input page$")
	public void goToDriveTimeCalculatorInput() throws Throwable {
		webDriver.get("http://localhost:8080/m3-java-ssg-exercises-pair/");
		homePage.clickDriveTimeCalculatorLink();
	}

	@Given("^I choose the planet (.*)$")
	public void choosePlanet(String planetName) throws Throwable {
		driveTimeInput.selectPlanet(planetName);
	}
	
	@Given("^I choose the transportation (.*)$")
	public void chooseTransportation(String  ) throws Throwable {
		driveTimeInput.selectTransportation();
	}
	
	@Given("^I enter a weight of(.*) pounds$")
	public void enter(String weight) throws Throwable {
		weightInput.inputWeight(weight);
	}
	
	@When("^I submit the weight calculator form$")
	public void submitWeightInput() throws Throwable {
		weightInput.submit();
	}
	
	@Then("^the calculated weight should be (.*) pounds$")
	public void verifyWeight(String weight) throws Throwable {
		Assert.assertTrue(weightResult.verifyWeight(weight));
	}
}