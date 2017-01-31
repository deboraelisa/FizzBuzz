package com.techelevator.person;


public class PersonTest {

	public static void main(String[] args) {
		
		// write code here that verifies the functionality of the Person class
		boolean allTestsPassed = true;
		
		Person myPerson = new Person();
		
		myPerson.setAge(2);
		if(myPerson.isAdult() != false) {
			allTestsPassed = false;
			System.out.println("Test FAILED: The person is not an adult.");
		}
		
		myPerson.setAge(23);
		if(myPerson.isAdult() != true) {
			allTestsPassed = false;
			System.out.println("Test FAILED: The person is an adult.");
		}
		
		myPerson.setFirstName("Adam");
		myPerson.setLastName("Smith");
		//Assert.assertEquals("Test FAILED: The full name should be Adam Smith.", "Adam Smith" , myPerson.getFullName());
		if(myPerson.getFullName().equals("Adam Smith") == false){
			System.out.println("Test FAILED: The full name should be Adam Smith." + myPerson.getFullName());
		allTestsPassed = false;
	}
		if(allTestsPassed) {
			System.out.println("All tests PASSED!");
		}
	}

}
