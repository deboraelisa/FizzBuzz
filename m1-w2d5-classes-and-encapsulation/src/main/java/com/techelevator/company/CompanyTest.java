package com.techelevator.company;


public class CompanyTest {

	public static void main(String[] args) {

		// write code here that verifies the functionality of the Company class
		boolean allTestsPassed = true;

		Company myCompany = new Company("ABC");
		if(myCompany.getName() != "ABC") {
			allTestsPassed = false;
			System.out.println("Test FAILED: The company name was not set.");
		}

		myCompany.setNumberOfEmployees(2);
		if(myCompany.getCompanySize() != "small") {
			allTestsPassed = false;
			System.out.println("Test FAILED: The company size should be small.");
		}

		myCompany.setNumberOfEmployees(55);
		if(myCompany.getCompanySize() != "medium") {
			allTestsPassed = false;
			System.out.println("Test FAILED: The company size should be medium.");
		}

		myCompany.setNumberOfEmployees(270);
		if(myCompany.getCompanySize() != "large") {
			allTestsPassed = false;
			System.out.println("Test FAILED: The company size should be large.");
		}

		myCompany.setRevenue(500000.00);
		myCompany.setExpenses(550000.00);
		if(myCompany.getProfit() != -50000.00) {
			allTestsPassed = false;
			System.out.println("Test FAILED: The company should have a negative $50000.00 profit.");
		}

		if(allTestsPassed) {
			System.out.println("All tests PASSED!");
		}
	}	
}
