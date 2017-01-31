package com.techelevator.person;

public class Person {

	/*
	 
	 The Person class has the following properties
	 	firstName
		lastName
		fullName * 
		age
	 	adult **
	 
	 Please select an appropriate data type, and write a getter and setter for each property listed above. 
	 Note, some properties may or may not require both a getter and a setter.
	 
	 Use the main method in PersonTest.java to verify the functionality of the Person class.  
	 (Please see notes in PersonTest.java for further instructions.)
	 
	  * fullName is derived (i.e. calculated), and does not need a setter.
	  
	 ** adult is derived (i.e. calculated), and does not need a setter. Any person whose age is 18 or greater is an adult.
	 
	 */

	//
	// Write your code below
	//

	private String firstName;
	private String lastName;
	private String fullName;
	private int age;
	private boolean adult;
	
	public Person() {
	}
	
	public String getFullName() {
		fullName = firstName + " " + lastName;
		return fullName;
	}
	
	public boolean isAdult() {
		if( age < 18) {
			adult = false;
		} else {
			adult = true;
		}
		return adult;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		if(age < 0) {
			System.out.println("Age cannot be less than 0.");
		} else {
		this.age = age;
		}
		}
	
	
	
}
