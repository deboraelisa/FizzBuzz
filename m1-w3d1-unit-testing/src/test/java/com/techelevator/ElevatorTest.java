package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ElevatorTest {
private Elevator myElevator;

@Before
public void setup(){
//Arrange
	myElevator = new Elevator(3, 12);
}

@Test
public void is_elevator_created_properly(){
	Assert.assertEquals("After creation, elevator should be in Shaft 3", myElevator.getShaftNumber());
	Assert.assertEquals("There should be 12 floors.", myElevator.getNumberOfLevels());
	Assert.assertEquals("After creation, elevator level should be 1", myElevator.getCurrentLevel());
}

@Test
public void check_current_level(){
//Assert
Assert.assertEquals("The current level should be 1.",1, myElevator.getCurrentLevel());
}

@Test
public void check_number_of_levels(){
//Act
myElevator.getNumberOfLevels();
//Assert
Assert.assertEquals("The number of levels should be 12.",12, myElevator.getNumberOfLevels());
}

@Test
public void check_if_door_opens(){
//Act
myElevator.OpenDoor();
//Assert
Assert.assertEquals("The door should be open(True)", myElevator.isDoorOpen());
}

@Test
public void check_if_door_closes(){
//Act
myElevator.CloseDoor();
//Assert
Assert.assertEquals("The door should be closed(False)", myElevator.isDoorOpen());
}

}