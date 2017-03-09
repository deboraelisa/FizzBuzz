package com.techelevator;

public class FedEx implements DeliveryDriver{
	
	@Override
	public double calculateRate(double weight, int distance) {
		double rate = 20.0;
		if(weight > 48) {
			rate = rate + 3.00;
		}
		if(distance > 500) {
			rate = rate + 5.00;
		} 
		return rate;
	} 	
}


//##### FexEd
//
//FexEd "is-a" DeliveryDriver and charges a flat rate for all packages, but may apply 
//extra charges based upon weight and distance
//
//    rate = 20.00
//    if distance > 500 miles then rate = rate + 5.00
//    if weight > 48 ounces then rate = rate + 3.00
