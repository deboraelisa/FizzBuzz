package com.techelevator;
/*
 * ## Airplane
 * 
 * ### Data Members
 * 
 * planeNumber bookedFirstClassSeats totalFirstClassSeats bookedCoachSeats
 * totalCoachSeats
 * 
 * ### Constructors
 * 
 * Airplane(int totalFirstClassSeats, int totalCoachSeats)
 * 
 * ### Methods
 * 
 * bool reserveSeats(bool firstClass, int numberOfSeatsToBuy)
 ** 
 * 
 * Notes** - An airplane can't exist without seats. Make a constructor require a
 * number of first class and coach seats be provided - `reserveSeats()` is a
 * method - if firstClass is true, update the number of remaining first class
 * seats using `totalNumberOfSeats` - if firstClass is false, update the number
 * of remaining coach class seats using `totalNumberOfSeats` - return a bool
 * indicating if the reservation can be made
 */

public class Airplane {
	String planeNumber;
	private int bookedFirstClassSeats;
	private int totalFirstClassSeats;
	private int bookedCoachSeats;
	private int totalCoachSeats;

	public Airplane() {
		bookedFirstClassSeats = 0;
		totalFirstClassSeats = 0;
		bookedCoachSeats = 0;
		totalCoachSeats = 0;
	}

	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}

	public int setBookedFirstClassSeats(int bookedFirstClassSeats) {
		return bookedFirstClassSeats;
	}

	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}

	public int setTotalFirstClassSeats(int totalFirstClassSeats) {
		return totalFirstClassSeats;
	}

	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}

	public int setBookedCoachSeats(int bookedCoachSeats) {
		return bookedCoachSeats;
	}

	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}

	public int setTotalCoachSeats(int totalCoachSeats) {
		return totalCoachSeats;
	}

	public Airplane(int totalFirstClassSeats, int totalCoachSeats) {
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
	}

	public boolean reserveSeats(boolean firstClass, int numberOfSeatsToBuy) {
		if (firstClass) {
			int availableSeats = totalFirstClassSeats - bookedFirstClassSeats;
			if (availableSeats > numberOfSeatsToBuy) {
				bookedFirstClassSeats = bookedFirstClassSeats + numberOfSeatsToBuy;
				return true;
			} else {
				return false;
			}
		} else {
			int availableSeats = totalCoachSeats - bookedCoachSeats;
			if (availableSeats > numberOfSeatsToBuy) {
				bookedCoachSeats = bookedCoachSeats + numberOfSeatsToBuy;
				return true;
			} else {
				return false;
			}
		}
	}


}
