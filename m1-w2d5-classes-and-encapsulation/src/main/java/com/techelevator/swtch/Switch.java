package com.techelevator.swtch; // "swtch" misspelling intentional, "switch" is a Java keyword, and not allowed in package name.

/**
 * This class represents an on-off switch. It turns on. It turns off. And, you can even ask if it's on, or off.
 */
public class Switch {

	//
	// Add any properties, along with getters and/or setters, that may be needed to implements the class methods.
	//
	private boolean isOn;
	private boolean isOff;
	
	public Switch() {
		isOn = false;
		isOff = true;
	}
	
	/**
	 * Turns the switch on.
	 */
	public boolean turnOn() {
		isOn = true;
		return isOn;
	}
	
	/**
	 * Turns the switch off.
	 */
	public boolean turnOff() {
		isOn = false;
		isOff = true;
		return isOff;
	}
	
	/**
	 * @return true if the switch is currently on, otherwise false
	 */
	public boolean isOn() {
		if(isOn) {
			return true;
		}
		return false;
	}
	
	/**
	 * @return true if the switch is currently off, otherwise false
	 */
	public boolean isOff() {
		if(!isOn) {
			return true;
		}
		return false;
	}
	
}
