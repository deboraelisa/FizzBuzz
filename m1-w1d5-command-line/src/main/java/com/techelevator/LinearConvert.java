package com.techelevator;

import java.util.Scanner;

/*
 The foot to meter conversion formula is:
 	m = f * 0.3048
 	
 The meter to foot conversion formula is:
 	f = m * 3.2808399
 	
 Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet.
 Convert the length to the opposite measurement, and display the old and new measurements to the console.
  
 $ java LinearConvert
 Please enter the length: 58
 Is the measurement in (m)eter, or (f)eet? f
 58f is 17m.
 */

public class LinearConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the length: ");
		int length = input.nextInt();
		input.nextLine();
		System.out.println("Is the length in (m)eter, or (f)eet?");
		String scale = input.nextLine(); 

		if(scale.equals("m")) {
			//This is meters
			//f = m * 3.2808399	
			int fLength = (int)(length * 3.2808399);
			System.out.println(length + "m is " + fLength + "f.");
		} else {
			//this is feet
			//m = f * 0.3048
			int mLength = (int)(length * 0.3048); 
			System.out.println(length + "f is " + mLength + "m.");
		}
		input.close();
	}
}


