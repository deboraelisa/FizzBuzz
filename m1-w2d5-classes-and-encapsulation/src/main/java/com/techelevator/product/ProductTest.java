package com.techelevator.product;

public class ProductTest {

	public static void main(String[] args) {
		
		// write code here that verifies the functionality of your Product class

		boolean allTestsPassed = true;		
		
		Product myProduct = new Product();

		myProduct.setName("Strawberries");
		if(myProduct.getName() != "Strawberries") {
			allTestsPassed = false;
			System.out.println("Test FAILED: The product name should be strawberries.");
		}
		
		myProduct.setPrice(2.00);
		if(myProduct.getPrice() != 2.00) {
			allTestsPassed = false;
			System.out.println("Test FAILED: The product price should be 2.00.");
		}
		
		myProduct.setWeightInOunces(8);
		if(myProduct.getWeightInOunces() != 8) {
			allTestsPassed = false;
			System.out.println("Test FAILED: The product weight should be 8 ounces.");
		}
		
		
		if(myProduct.getTotalPrice() != 16.00) {
			allTestsPassed = false;
			System.out.println("Test FAILED: The product total price should be 16.00.");
		}
		
		if(allTestsPassed) {
			System.out.println("All tests PASSED!");
		}
	}

}
