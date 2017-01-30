package com.techelevator;

/*	## Smart Phone

### Data Members

    phoneNumber
    carrier
    operatingSystem
    batteryCharge
    onCall

### Constructor

    SmartPhone(phoneNumber)

### Methods

    bool call(phoneNumberToCall)
    answer()
    hangup()

 **Notes**
- A smartphone requires a phone number
- The `answer()` method sets `onCall` to true
- The `call()` method makes sure the phone number is 10 digits and sets `onCall` to true. If the phone number is not length 10, it does not set `onCall` to true.
- The `hangUp()` method sets `onCall` to false*/

public class SmartPhone {
	private String phoneNumber;
	private String carrier;
	private String operatingSystem;
	private boolean batteryCharge;
	private boolean onCall;

	public SmartPhone() {
		phoneNumber = new String();
		carrier = new String();
		operatingSystem = new String();
		batteryCharge = false;
		onCall = false;
	}

	public SmartPhone(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean answer(){
		onCall = true;
		return onCall;
	}


	public boolean hangup(){
		onCall = false;
		return onCall;
	}

	public String getPhoneNumber() {
		Integer.parseInt(phoneNumber);
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		if(phoneNumber != null ? !phoneNumber.isEmpty() : phoneNumber.length() == 10){
			this.phoneNumber = phoneNumber;
		} 
	}

	public boolean call(String phoneNumber) {
		if(phoneNumber != null && !phoneNumber.isEmpty() && phoneNumber.length() == 10) {
			onCall = true;
			return true;
		} else {
			onCall = false;
			return false;
		}
	}

	public boolean isOnCall() {
		return onCall;
	}
}





