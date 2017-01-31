package com.techelevator.company;

public class Company {	
	/*

	 The Company class has the following properties
		name
		numberOfEmployees
		revenue
		expenses
	 	companySize * 
	 	profit **	 

	 Please select an appropriate data type, and write a getter and setter for each property listed above. 
	 Note, some properties may or may not require both a getter and a setter.

	 Use the main method in PersonTest.java to verify the functionality of the Person class.  
	 (Please see notes in PersonTest.java for further instructions.)

	 * companySize is derived (i.e. calculated), and does not need a setter. A company is "small" if less than 50 employees,
	  	"medium" if between 51 and 250 employees, "large" if greater than 250 employees.

	 ** profit is derived (i.e. calculated), and does not need a setter. Profit equals revenue minus expenses.

	 */

	//
	// Write your code below
	//
	private String name;
	private int numberOfEmployees;
	private Double revenue;
	private Double expenses;
	private String companySize;
	private Double profit;

	public Company(String companyName) {
		name = companyName;
	}

	public String getCompanySize() {
		if(numberOfEmployees < 50) {
			companySize = "small";
		} else if 
		(numberOfEmployees >= 50 && numberOfEmployees <= 250) {
			companySize = "medium";
		} else if (numberOfEmployees > 250) {
			companySize = "large";
		} 
		return companySize;
	}

	public void setRevenue(Double revenue) {
		this.revenue = revenue;
	}

	public void setExpenses(Double expenses) {
		this.expenses = expenses;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public Double getProfit() {
		profit = revenue - expenses;
		return profit;
	}

	public String getName() {
		return name;
	}
}


