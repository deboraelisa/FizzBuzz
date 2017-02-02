package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class TelevisionTest {
	private Television tv;
	
	@Before
	public void setup(){
	//Arrange
 	tv = new Television();
	}
	
	@Test
	public void tv_is_initialized_correctly(){
	//Assert
		Assert.assertFalse("After construction, the tv should be off", tv.isOn());
		Assert.assertEquals("The default channel is 3", 3, tv.getSelectedChannel());
		Assert.assertEquals("The volume is 0", 0, tv.getCurrentVolume());
	}

	@Test
	public void turn_on_tv() {
		//Act
		tv.turnOn();
		
		//Assert
		Assert.assertTrue("The tv should be on", tv.isOn());
	}
	
	@Test
	public void turn_off_tv(){
		//Arrange
		tv.turnOn();
		
		//Act
		tv.turnOff();
		
		//Assert
		Assert.assertFalse("TV should be off", tv.isOn());
	}
	@Test
	public void change_channel_with_tv_on (){
		//Arrange
		tv.turnOn();
		
		//Act
		tv.ChangeChannel(4);
		
		//Assert
		Assert.assertEquals("Should have set the channel to 4", 4, tv.getSelectedChannel())
;	}
	
	@Test
	public void change_to_invalid_channel(){
		//Arrange
		tv.turnOn();
		
		//Act
		tv.ChangeChannel(19);
		
		//Assert
		Assert.assertEquals("Channel should not have changed", 3, tv.getSelectedChannel());
	}
	
	@Test
	public void change_to_channel_that_is_too_low(){
		//Arrange
		tv.turnOn();
		
		//Act
		tv.ChangeChannel(2);
		
		//Assert
		Assert.assertEquals("Channel should not have changed", 3, tv.getSelectedChannel());
	}
	
	@Test
	public void change_channel_with_tv_off(){
		//Act
		tv.ChangeChannel(4);
		
		//Assert
		Assert.assertEquals("Channel should not have changed", 3, tv.getSelectedChannel());
	}
	
	@Test
	public void raise_volume_with_tv_on(){
		//Arrange 
		tv.turnOn();
		for(int i=0; i < 5; i++) {
			tv.RaiseVolume();
		}
		
		//Assert
		Assert.assertEquals("Volume should be 5",5, tv.getCurrentVolume());
	}
	
	@Test
	public void raise_volume_with_tv_off(){
		// Act
		for(int i=0; i < 5; i++) {
			tv.RaiseVolume();
		}
		//Asssert
		Assert.assertEquals("Volume should be 0", 0, tv.getCurrentVolume()); 
	}
		
	@Test
	public void raise_volume_to_11(){
		//Arrange
		tv.turnOn();
		
		//Act 
		for(int i=0; i < 11; i++) {
			tv.RaiseVolume();
		}
		
		//Assert
		Assert.assertEquals("Volume should stop at 10", 10, tv.getCurrentVolume());
	}
		
	@Test
	public void lower_volume_from_1_to_0_with_tv_on() {
	//Arrange
		tv.turnOn();
		tv.RaiseVolume();
		
	//Act
		tv.LowerVolume();
		
	//Assert
		Assert.assertEquals("Volume should be back at 0", 0, tv.getCurrentVolume());
	}
	
	@Test
	public void lower_volume_from_1_to_0_with_tv_off(){
		//Arrange
		tv.RaiseVolume();
		
		//Act
		tv.LowerVolume();
		
		//Assert
		Assert.assertEquals("Volume should not change with tv off", 0, tv.getCurrentVolume());
	}
	
	@Test
	public void volume_should_not_go_below_zero(){
		//Arrange
		tv.turnOn();
		
		//Act
		tv.LowerVolume();
		
		//Assert
		Assert.assertEquals("Volume should not go below 0", 0, tv.getCurrentVolume());
	}
}

	
