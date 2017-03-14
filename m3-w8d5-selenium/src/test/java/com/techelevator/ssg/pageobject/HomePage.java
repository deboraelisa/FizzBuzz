package com.techelevator.ssg.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {

	private WebDriver webDriver;

	public HomePage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public WeightCalculatorInputPage clickWeightCalculatorLink(){
		WebElement link = webDriver.findElement(By.linkText("Alien Weight"));
		link.click();
		return new WeightCalculatorInputPage(webDriver);
	}
	
		public AgeCalculatorInputPage clickAgeCalculatorLink(){
			WebElement link = webDriver.findElement(By.linkText("Alien Age"));
			link.click();
			return new AgeCalculatorInputPage(webDriver);
	}
		
		public DriveTimeCalculatorInputPage clickDriveTimeCalculatorLink(){
			WebElement link = webDriver.findElement(By.linkText("Drive Time"));
			link.click();
			return new DriveTimeCalculatorInputPage(webDriver);
	}
		
		public SpaceForum clickSpaceForumLink(){
			WebElement link = webDriver.findElement(By.linkText("Space Forum"));
			link.click();
			return new SpaceForum(webDriver);
	}
		
		public SpaceStore clickSpaceStoreLink(){
			WebElement link = webDriver.findElement(By.linkText("Space Store"));
			link.click();
			return new SpaceStore(webDriver);
		}
}
