package com.techelevator;

public class Exercises {
	public static void main(String[] args) {// main method has to be static, void does not return anything/       

		///////////////////HomeworkAssignment///////////////////////////////////

		HomeworkAssignment assignment = new HomeworkAssignment();

		assignment.setSubmitter("Debora");
		assignment.setPossibleMarks(15);
		assignment.setTotalMarks(15);

		System.out.println("My grade is " + assignment.getLetterGrade());


		//////////////////////////FruitTree//////////////////////////////////////

		FruitTree fruit = new FruitTree();

		fruit.setFruitType("apple");
		fruit.setPiecesOfFruitLeft(8);
		if(fruit.pickFruit(4)) {
			System.out.println("There are " + fruit.getPiecesOfFruitLeft() + " apples left.");
		} else {
			System.out.println( "no apples wwere picked.");
		}

		////////////////////////////Employee////////////////////////////////////

		Employee biggerBucks= new Employee();

		biggerBucks.setEmployeeId("A234");
		biggerBucks.setName("John Smith");
		biggerBucks.setDepartment("Accounting");
		biggerBucks.setAnnualSalary(65000);
		System.out.println("The original salary is " + biggerBucks.getAnnualSalary() + ".");
		biggerBucks.raiseSalary(20);
		System.out.println("The raised salary is " + biggerBucks.getAnnualSalary() + ".");

		///////////////////////////// Airplane////////////////////////////////////

		Airplane myPlane = new Airplane(20, 100);
		myPlane.reserveSeats(true, 2);
		System.out.println("You booked " + myPlane.getBookedFirstClassSeats() + " First Class seats.");


		//////////////////////////////Smart Phone////////////////////////////////////////////////

		SmartPhone myPhone = new SmartPhone();

		System.out.println("What is the phone number?");
		if(myPhone.call("6149990099")) {
			System.out.println("OnCall is set " + myPhone.isOnCall() + ". The phone number is a valid phone number.");
		} else {
			System.out.println("OnCall is set " + myPhone.isOnCall() + ".");
		}
		System.out.println("OnCall is set " + myPhone.hangup() + "." );
		myPhone.hangup();

	}
}