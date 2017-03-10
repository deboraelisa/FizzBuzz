package com.techelevator.ssg.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AgeCalculatorResultsPage {
	private WebDriver webDriver;

	public AgeCalculatorResultsPage(WebDriver webDriver){
		this.webDriver = webDriver;
	}

	public boolean verifyAge(String age){
		WebElement outputAge = webDriver.findElement(By.id("ageResult"));
		return outputAge.getText().equals(age);
	}
}
