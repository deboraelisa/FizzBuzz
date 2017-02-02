package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class AirplaneTest {
	private Airplane myAirplane;
	
	@Before
	public void setup(){
	//Arrange
	myAirplane = new Airplane(4, 6);
	}
	
	@Test
	public void see_if_airplane_is_initialized_correctly(){
	//Act
	myAirplane.getTotalFirstClassSeats();
	myAirplane.getTotalCoachSeats();
	//Assert
	Assert.assertEquals("Total number of first class seats should be .", 4, myAirplane.getTotalFirstClassSeats());
	Assert.assertEquals("Total number of coach seats should be 6.", 6, myAirplane.getTotalCoachSeats());
	}
	
//	@Test
//	public void check_if_plane_number_is_valid(){
//	//Act
//	myAirplane.getPlaneNumber();
//	//Assert
//	Assert.assertEquals(expected, actual);
//	}
	@Test
	public void reserve_a_first_class_seat_with_2_tickets(){
	//Act
	myAirplane.getAvailableFirstClassSeats();
	myAirplane.Reserve(true, 2);
	//Assert
	Assert.assertTrue("You should be able to make a reservation.", myAirplane.Reserve(true, 2));
	}
	
	@Test
	public void reserve_a_first_class_seat_with_5_tickets(){
	//Act
	myAirplane.getAvailableFirstClassSeats();
	myAirplane.Reserve(true, 5);
	//Assert
	Assert.assertTrue("You should not be able to make a reservation.", myAirplane.Reserve(true, 5));
	}
	
	@Test
	public void reserve_a_coach_seat_with_2_tickets(){
	//Act
	myAirplane.getAvailableCoachSeats();
	myAirplane.Reserve(false, 2);
	//Assert
	Assert.assertTrue("You should be able to make a reservation.", myAirplane.Reserve(false, 2));
	}
	///////TRUE VS. FALSE?????
	@Test
	public void reserve_a_coach_seat_with_7_tickets(){
	//Act
	myAirplane.getAvailableCoachSeats();
	myAirplane.Reserve(false, 7);
	//Assert
	Assert.assertTrue("You should not be able to make a reservation.", myAirplane.Reserve(false, 7));
	}
}
