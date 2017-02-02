package com.techelevator;

public class SmartPhone {

    private String phoneNumber;
    private String carrier;
    private String operatingSystem;
    private boolean onCall;
    private int batteryCharge = 100;

    /**
     * Creates a new smart phone 
     * @param phoneNumber
     * @param carrier
     */
    public SmartPhone(String phoneNumber, String carrier){
    	if(phoneNumber.length() == 10 && phoneNumber!= null && !phoneNumber.isEmpty()){
    		this.phoneNumber = phoneNumber;
    	}
    	if(carrier!= null && !carrier.isEmpty()){
    		this.carrier = carrier;
    	}
    }

    /**
     * 10-digit phone number
     * @return phoneNumber
     */
    public String getPhoneNumber() {
       return phoneNumber;
    }


    /**
     * Phone carrier
     * @return carrier
     */
    public String getCarrier() {
        return carrier;            
    }

    /**
     * Phone OS
     * @return operatingSystem
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * Phone OS
     * @param operatingSystem 
     */
    public void setOperatingSystem(String operatingSystem){
    	this.operatingSystem = operatingSystem;
    }

    /**
     * Battery charge value from 0 to 100 
     * @return batteryCharge
     */
    public int getBatteryCharge() {
        return batteryCharge;            
    }

    /**
     * On Call status
     * @return onCall
     */
    public boolean isOnCall() {
        return true;            
    }

    /**
     * 
     * @param phoneNumberToCall places a phone call<
     * @param numberOfMinutesToTalk 1 minute drains 1% of battery
     * @return True if the call could be placed, false otherwise
     */
    public boolean Call(String phoneNumberToCall, int numberOfMinutesToTalk)
    {   if(phoneNumberToCall.length() == 10 && phoneNumberToCall != null && !phoneNumberToCall.isEmpty() && numberOfMinutesToTalk <= 100) {                   
        onCall = true;
        batteryCharge -= numberOfMinutesToTalk;
        return true;
    } 
    	return false;
    }

    /**
     * Answer the phone. OnCall will be set to true. Battery juice is free when you answer the phone 
     */
    public boolean AnswerPhone()
    {
        onCall = true;
        return true;
    }

    /**
     * Hangs up the phone. OnCall will be set to false. 
     */
    public boolean HangUp()
    {
        onCall = !onCall;
        return true;
    }

    /**
     * Recharges the battery from wherever it is at back to 100 
     */
    public int RechargeBattery()
    {
        batteryCharge = 95;
        return batteryCharge;
    }
   

}
