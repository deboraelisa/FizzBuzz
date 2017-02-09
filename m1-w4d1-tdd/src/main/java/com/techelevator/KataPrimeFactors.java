package com.techelevator;

public class KataPrimeFactors {

	public int [] factorize(int value) {
		int firstFactor = 0;
		int secondFactor = 0;
		if(value % 2 == 0 && value > 2) {
			firstFactor = 2;
			secondFactor = value/2;
		} else if(value % 3 == 0 && value > 3){
			firstFactor = 3;
			secondFactor = value/3;
		} else {
			return new int[]{value};
		}

		int [] refactors = factorize(secondFactor);
		int [] results = new int[refactors.length + 1];

		results[0] = firstFactor;
		for(int i=0; i < refactors.length; i++){
			results[i+1] = refactors[i];
		}
		return results;
	}
}
