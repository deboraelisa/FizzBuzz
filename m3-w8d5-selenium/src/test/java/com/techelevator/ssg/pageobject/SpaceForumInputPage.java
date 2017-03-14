package com.techelevator.ssg.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SpaceForumInputPage {
	private WebDriver webDriver;
	
	public SpaceForumInputPage(WebDriver webDriver){
		this.webDriver = webDriver;
	}
	
	public void inputUserName(String userName){
		WebElement userNameInput = webDriver.findElement(By.name("username")); 
		userNameInput.sendKeys(userName); 
	}
	
	public void inputSubject(String subject){
		WebElement subjectInput = webDriver.findElement(By.name("subject"));
		subjectInput.sendKeys(subject); 
	}
	
	public void inputMessage(String message){
		WebElement messageInput = webDriver.findElement(By.name("message"));
		messageInput.sendKeys(message); 
	}
	
	public SpaceForum submit(){
		WebElement submitButton = webDriver.findElement(By.id("submit"));
				submitButton.submit();
		return new SpaceForum(webDriver);
	}
}
	
