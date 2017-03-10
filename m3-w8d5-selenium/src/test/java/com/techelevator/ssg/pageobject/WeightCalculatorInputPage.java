package com.techelevator.ssg.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WeightCalculatorInputPage {
	private WebDriver webDriver;
	
	public WeightCalculatorInputPage(WebDriver webDriver){
		this.webDriver = webDriver;
	}
	
	public void selectPlanet(String planetName){
		//need to look for specific id
		WebElement selectElement = webDriver.findElement(By.id("planetSelect"));//whatever id we used to identify elements in jsp.folder
		Select select = new Select(selectElement);
		select.selectByVisibleText(planetName);
	}
	
	public void inputWeight(String weight){
		WebElement weightInput = webDriver.findElement(By.name("earthWeight")); //check correct "name"
		weightInput.sendKeys(weight); //sendKeys simulates user input
	}
	
	public WeightCalculatorResultsPage submit(){
		WebElement submitButton = webDriver.findElement(By.id("submitWeight"));
				submitButton.submit();
		return new WeightCalculatorResultsPage(webDriver);
	}
}
