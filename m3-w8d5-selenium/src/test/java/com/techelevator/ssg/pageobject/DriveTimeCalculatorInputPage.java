package com.techelevator.ssg.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DriveTimeCalculatorInputPage {
	private WebDriver webDriver;
	
	public DriveTimeCalculatorInputPage(WebDriver webDriver){
		this.webDriver = webDriver;
	}
	
	public void selectPlanet(String planetName){
		WebElement selectElement = webDriver.findElement(By.id("planetSelect"));
		Select select = new Select(selectElement);
		select.selectByVisibleText(planetName);
	}
	
	public void selectTransportation(String transportation){
		WebElement selectElement = webDriver.findElement(By.id("transportationSelect"));
		Select select = new Select(selectElement);
		select.selectByVisibleText(transportation);
	}
	
	public void inputAge(String age){
		WebElement ageInput = webDriver.findElement(By.name("earthAge"));
		ageInput.sendKeys(age); 
	}
	
	public DriveTimeCalculatorResultsPage submit(){
		WebElement submitButton = webDriver.findElement(By.id("driveTimeResult"));
				submitButton.submit();
		return new DriveTimeCalculatorResultsPage(webDriver);
	}
}
