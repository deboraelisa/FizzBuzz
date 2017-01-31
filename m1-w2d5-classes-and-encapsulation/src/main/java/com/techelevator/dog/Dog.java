package com.techelevator.dog;

/**
 * This class represents a dog that can sleep, wake, and make a sound, so it's pretty much like most dogs,
 * with a few essential methods missing. Thankfully.
 */
public class Dog {

	//
	// Add any properties, along with getters and/or setters, that may be needed to implements the class methods and/or constructors.
	//
	private boolean sleep;

	public Dog() {
		sleep = false;
	}

	/**
	 * @return "woof!" if the dog is awake, otherwise "Zzzz..."
	 */
	public String makeSound() {
		if(sleep) { 
			return "Zzzz...";
		} else {
			return "woof!";
		}
	}

	/**
	 * Puts the dog to sleep
	 */
	public void sleep() {
		sleep = true;
	}

	/**
	 * Wakes the dog up
	 */
	public void wakeUp() {
		sleep = false;
	}

	/**
	 * @return true if the dog is sleeping, otherwise false
	 */
	public boolean isSleeping() {
		return sleep;
	}

}
