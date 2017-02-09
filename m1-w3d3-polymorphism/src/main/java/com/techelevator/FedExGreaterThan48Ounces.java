package com.techelevator;

	public class FedExGreaterThan48Ounces implements DeliveryDriver{


		@Override
		public double calculateRate(double distance, int weight) {
			double rate = 0;
			if(weight > 48) {
				rate = rate +3.00;
			}
			return rate;
		} 
}
