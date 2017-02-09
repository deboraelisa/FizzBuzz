package com.techelevator;


public class SPUNextDay implements DeliveryDriver{


		@Override
		public double calculateRate(double distance, int weight) {
			double rate = (weight * 0.075) * distance;
			return rate;
		}
}

	//SPU "is-a" DeliveryDriver and follows a simple formula based upon class, weight (in lbs) and distance.
	//
//	    If four-day ground then rate = (weight * 0.0050) * distance
//	    If two-day business then rate = (weight * 0.050) * distance
//	    if next day then rate = (weight * 0.075) * distance

