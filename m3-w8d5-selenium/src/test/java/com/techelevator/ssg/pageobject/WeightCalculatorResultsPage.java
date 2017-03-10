package com.techelevator.ssg.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WeightCalculatorResultsPage {
private WebDriver webDriver;

public WeightCalculatorResultsPage(WebDriver webDriver){
	this.webDriver = webDriver;
}

public boolean verifyWeight(String weight){
	WebElement outputWeight = webDriver.findElement(By.id("weightResult"));
	return outputWeight.getText().equals(weight);
}
}
