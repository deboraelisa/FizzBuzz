package com.techelevator;

public class FedExGreaterThan500Miles implements DeliveryDriver{


	@Override
	public double calculateRate(double distance, int weight) {
		double rate = 0;
		if(distance > 500) {
			rate = rate + 5.00;
		}
		return rate;
	} 
}
