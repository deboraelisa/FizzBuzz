package com.techelevator.ssg.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpaceStore {

	private WebDriver webDriver;
	
	public SpaceStore(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public SpaceStoreInputPage clickItemImageToPurchase(){
		WebElement purchaseNewItem = webDriver.findElement(By.className("storeImage"));
		purchaseNewItem.click();
		return new SpaceStoreInputPage(webDriver);
	}
	
	public SpaceStoreInputPage selectItemToPurchase(String product) {
		WebElement productToPurchase = webDriver.findElement(By.id(product));
		productToPurchase.click();
		return new SpaceStoreInputPage(webDriver);
	}
	
	public boolean verifyPurchase(String quantity, String productName) {
		WebElement quantityPurch = webDriver.findElement(By.cssSelector(".purchaseQuantity:nth-last-child(2)"));
		WebElement productPurch = webDriver.findElement(By.cssSelector(".purchaseName:nth-last-child(4)"));
		return quantityPurch.getText().equals(quantity) && productPurch.getText().equals(productName);
	}
	
}
