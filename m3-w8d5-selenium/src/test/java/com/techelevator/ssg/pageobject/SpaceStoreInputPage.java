package com.techelevator.ssg.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpaceStoreInputPage {
	private WebDriver webDriver;
	
	
	public SpaceStoreInputPage(WebDriver webDriver){
		this.webDriver = webDriver;
	}
	
	public void addQuantityToPurchase(String quantity){
		WebElement purchaseQuantity = webDriver.findElement(By.id("quantity"));
		purchaseQuantity.sendKeys(quantity);
	}
	
	public SpaceStore submit(){
		WebElement submitButton = webDriver.findElement(By.id("addToCartButton"));
				submitButton.submit();
		return new SpaceStore(webDriver);
	}
}
