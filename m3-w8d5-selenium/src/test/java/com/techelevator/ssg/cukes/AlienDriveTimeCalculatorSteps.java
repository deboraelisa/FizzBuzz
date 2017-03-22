package com.techelevator.ssg.cukes;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techelevator.ssg.pageobject.DriveTimeCalculatorInputPage;
import com.techelevator.ssg.pageobject.DriveTimeCalculatorResultsPage;
import com.techelevator.ssg.pageobject.HomePage;
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

	@Given("^I pick the planet (.*)$")
	public void choosePlanet(String planetName) throws Throwable {
		driveTimeInput.selectPlanet(planetName);
	}
	
	@Given("^I choose the transportation (.*)$")
	public void chooseTransportation(String transportation) throws Throwable {
		driveTimeInput.selectTransportation(transportation);
	}
	
	@Given("^I input an age of (.*) years old$")
	public void enterAge(String age) throws Throwable {
		driveTimeInput.inputAge(age);
	}
	
	@When("^I deliver the drive calculator form$")
	public void submitDriveTimeInput() throws Throwable {
		driveTimeInput.submit();
	}
	
	@Then("^the result drive time should be (.*) years$")
	public void verifyDriveTime(String driveTime) throws Throwable {
		Assert.assertTrue(driveTimeResult.verifyAge(driveTime));
	}
	
	@Then("^the age after arrival will be (.*) years$")
	public void verifyAge(String outputAge) throws Throwable {
		Assert.assertTrue(driveTimeResult.verifyAge(outputAge));
	}
}