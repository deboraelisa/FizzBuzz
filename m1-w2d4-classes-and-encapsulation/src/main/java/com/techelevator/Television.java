package com.techelevator;

//### Data Members
//
//isOn        
//selectedChannel
//currentVolume
//
//### Methods
//
//turnOff()
//turnOn()
//changeChannel(int newChannel)
//raiseVolume()
//lowerVolume()    
//
//**Notes**
//- `turnOn()` besides turning the tv on, it also resets the channel to 3 and the volume to 2
//- `raiseVolume()` increases the volume by 1. The limit is 10
//- `lowerVolume()` decreases the volume by 1. The limit is 0

public class Television {

	private int selectedChannel;
	private boolean isOn = false;
	private int currentVolume;
	
	public int getSelectedChannel() {
		return selectedChannel;
	
	}
	public void setSelectedChannel(int selectedChannel) {
		this.selectedChannel = selectedChannel;
	}
	
	public boolean isOn() {
		return isOn;
	}
	
	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
	public int getCurrentVolume() {
		return currentVolume;
	}
	public void setCurrentVolume(int currentVolume) {
		this.currentVolume = currentVolume;
	}
	
	//turnOff()
	//turnOn()
	//changeChannel(int newChannel)
	//raiseVolume()
	//lowerVolume() 
	
	public void turnOff() {
		isOn = false;
	}
	
	public void turnOn(){
		isOn = true;
		selectedChannel = 3;
		currentVolume = 2;
	}
	
	public void changeChannel(int newChannel){
		selectedChannel = newChannel;
	}
	
	public void raiseVolume(){
		if(currentVolume < 10) {
			currentVolume ++;
		}
	}
	
	public void lowerVolume(){
		if(currentVolume > 0) {
			currentVolume --;
		}
	}
	
}


