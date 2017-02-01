package com.techelevator;



//### Data Members
//
//shaftNumber
//currentLevel
//numberOfLevels
//doorOpen
//isMoving
//
//### Constructor
//
//Elevator(int totalNumberOffloors)
//
//### Methods
//
//void openDoor()
//void closeDoor()
//bool goUp(int desiredFloor)
//bool goDown(int desiredFloor)        
//
//**Notes**
//- A new elevator must start on floor 0.
//- Elevators cannot go up past the last floor
//- Elevators cannot go down past floor one
//- Elevators cannot go up when the door is open
//- `goUp()` changes the currentLevel and returns true 
//if the elevator is able to move up
//- `goDown()` changes the currentLevel and returns true if the 
//elevator is able to move down

public class Elevator {
	private int shaftNumber;
	private int currentLevel;
	private int numberOfLevels;
	private boolean doorOpen;
	private boolean isMoving;

	public Elevator(int totalNumberOfFloors) {
		numberOfLevels = totalNumberOfFloors; 
		currentLevel = 0;
		doorOpen = false;	
		isMoving = false;
	}

		public int getCurrentLevel() {
			return currentLevel;
		}

		public void setCurrentLevel(int currentLevel) {
			if(currentLevel > 0 && currentLevel <= numberOfLevels)
			this.currentLevel = currentLevel;
		}

		public int getNumberOfLevels() {
			return numberOfLevels;
		}

		public void setNumberOfLevels(int numberOfLevels) {
			if(numberOfLevels >0)
			this.numberOfLevels = numberOfLevels;
		}

		public void openDoor() {
			doorOpen = true;
		}

		public void closeDoor() {
			doorOpen = false;
		}

		public boolean goUp(int desiredFloor) {
			if((desiredFloor < numberOfLevels) && (doorOpen == false)) {
				currentLevel = desiredFloor;
				return true;
			} else {
			return false;
			}
		}

		public boolean goDown(int desiredFloor){
			if((desiredFloor >= 1) && (doorOpen == false)  && 
					(desiredFloor <= numberOfLevels -1)) {
				currentLevel = desiredFloor;
				return true;
			} else {
			return false;
			}
		}
		
}
//void openDoor()
//void closeDoor()
//bool goUp(int desiredFloor)
//bool goDown(int desiredFloor)        
//
//- `goUp()` changes the currentLevel and returns true 
//if the elevator is able to move up
//- `goDown()` changes the currentLevel and returns true if the 
//elevator is able to move down
