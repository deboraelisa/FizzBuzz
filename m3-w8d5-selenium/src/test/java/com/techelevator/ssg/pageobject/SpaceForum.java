package com.techelevator.ssg.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpaceForum {

	private WebDriver webDriver;

	public SpaceForum(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public SpaceForumInputPage clickNewMessageLink() {
		WebElement inputNewMessage = webDriver.findElement(By.linkText("Post a Message"));
		inputNewMessage.click();
		return new SpaceForumInputPage(webDriver);
	}
	
	public boolean VerifyPost(String userName, String subject, String message) {
		WebElement userElem = webDriver.findElement(By.cssSelector(".post:nth-last-child(1) .username"));
		WebElement subjectElem = webDriver.findElement(By.cssSelector(".post:nth-last-child(1) h2"));
		WebElement messageElem = webDriver.findElement(By.cssSelector(".post:nth-last-child(1) .message"));
		
		return userElem.getText().equals(userName) && subjectElem.getText().equals(subject) && messageElem.getText().equals(message);
	}
}
