package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SmartPhoneTest {
	private SmartPhone myPhone;
	
	@Before
	public void setup() {
		//Arrange
		myPhone = new SmartPhone("6142223344", "Sprint");
	}
	
	@Test
	public void check_if_Smartphone_is_fully_charged(){
	//Act
	myPhone.getBatteryCharge();
	//Assert
	Assert.assertEquals("The battery should be fully charged.", 100, myPhone.getBatteryCharge());
	}
		
	@Test
	public void check_if_phone_number_is_valid(){
	//Act
	myPhone.getPhoneNumber();
	//Assert
	Assert.assertEquals("The phone number should have 10 digits.", "6142223344", myPhone.getPhoneNumber());
	}
	
	@Test
	public void check_if_carrier_is_valid(){
	//Act
	myPhone.getCarrier();
	//Assert
	Assert.assertEquals("The carrier should be a string.", "Sprint", myPhone.getCarrier());
	}
	
	@Test
	public void set_operating_system_and_see_if_it_is_valid(){
	//Act
	myPhone.setOperatingSystem("Android");
	//Assert
	Assert.assertEquals("The operating system should be a string.", "Android", myPhone.getOperatingSystem());
	}
	
	@Test
	public void check_battery_charge_when_answering(){
	//Act
	myPhone.AnswerPhone();
	//Assert
    Assert.assertTrue("Phone should have turned on.", myPhone.AnswerPhone());
    Assert.assertEquals("The battery charge should not have changed when answering phone.", 100, myPhone.getBatteryCharge());
	}
	
	@Test
	public void placing_a_call_for_10_minutes(){
	//Act
	myPhone.Call("7409998877", 10);
	//Assert
	Assert.assertTrue(myPhone.isOnCall());
	Assert.assertEquals("When using the phone for 10 minutes, battery charge goes down to 90%.", 90, myPhone.getBatteryCharge());
	}
	
	@Test
	public void placing_a_call_for_101_minutes(){
	//Act
	myPhone.Call("7409998877", 101);
	//Assert
	Assert.assertTrue(myPhone.isOnCall());
	Assert.assertEquals("The battery won't last for 101 minutes.", 101, myPhone.getBatteryCharge());
	}
	
	@Test
	public void placing_a_call_to_invalid_phone_number(){
	//Act
	myPhone.Call("17409998877", 5);
	//Assert
	Assert.assertTrue(myPhone.isOnCall());
	Assert.assertEquals("The phone call should not be able to be placed, wrong phone number", 5, myPhone.getBatteryCharge());
	}
	
	@Test
	public void check_answering_the_phone_status(){
	//Act
	myPhone.isOnCall();
	//Assert
	Assert.assertFalse("The phone should be on a call.", myPhone.isOnCall());
	}
	
	@Test
	public void check_hanging_up_the_phone(){
	//Act
	myPhone.HangUp();
	//Assert
	Assert.assertTrue("The phone should be turned off.", myPhone.HangUp());
	}
	
	@Test
	public void recharging_the_battery(){
	//Act
	myPhone.RechargeBattery();
	//Assert
	Assert.assertEquals("Battery should recharge to 95%.", 95, myPhone.RechargeBattery());
	}
		
}
