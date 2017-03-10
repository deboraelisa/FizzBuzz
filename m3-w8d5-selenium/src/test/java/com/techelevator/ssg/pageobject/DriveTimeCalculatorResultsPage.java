package com.techelevator.ssg.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriveTimeCalculatorResultsPage {
	private WebDriver webDriver;

	public DriveTimeCalculatorResultsPage(WebDriver webDriver){
		this.webDriver = webDriver;
	}

	public boolean verifyDriveTime(String driveTime){
		WebElement outputDriveTime = webDriver.findElement(By.id("driveTime"));
		return outputDriveTime.getText().equals(driveTime);
	}
	
	public boolean verifyAge(String age){
		WebElement outputAge = webDriver.findElement(By.id("ageAfterTravel"));
		return outputAge.getText().equals(age);
	}
}
