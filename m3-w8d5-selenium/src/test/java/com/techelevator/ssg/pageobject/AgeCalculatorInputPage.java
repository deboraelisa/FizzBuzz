package com.techelevator.ssg.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AgeCalculatorInputPage {
	private WebDriver webDriver;

	public AgeCalculatorInputPage(WebDriver webDriver){
	this.webDriver = webDriver;
}

	public void selectPlanet(String planetName){
		//need to look for specific id
		WebElement selectElement = webDriver.findElement(By.id("planetSelect"));
		Select select = new Select(selectElement);
		select.selectByVisibleText(planetName);
	}
	
	public void inputAge(String age){
		WebElement ageInput = webDriver.findElement(By.name("earthAge")); 
		ageInput.sendKeys(age);
	}
	
	public AgeCalculatorResultsPage submit(){
		WebElement submitButton = webDriver.findElement(By.id("submitAge"));
				submitButton.submit();
		return new AgeCalculatorResultsPage(webDriver);
	}
}