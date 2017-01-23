package com.techelevator;

import java.util.Scanner;

/*
Write a command line program which prompts the user for a series of decimal integer values  
and displays each decimal value as itself and its binary equivalent

$ DecimalToBinary 

Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

460 in binary is 111001100
8218 in binary is 10000000011010
1 in binary is 1
31313 in binary is 111101001010001
987654321 in binary is 111010110111100110100010110001
*/


public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a series of decimal values (separated by spaces):");

		String decimalValues = input.nextLine();

		String [] numbersArray = decimalValues.split(" ");


		for(int i = 0; i < numbersArray.length; i++) {
			int num = Integer.parseInt(numbersArray[i]); 
			int powerOfTwo = 1;
			while(powerOfTwo < num) {
				powerOfTwo = powerOfTwo * 2;
			}
			while(powerOfTwo > 0) {
				if(powerOfTwo > num) {
					System.out.print("0");	
				} else {
					System.out.print("1");
					num = num - powerOfTwo;
				}
				powerOfTwo = powerOfTwo / 2;
			} 
			System.out.println("\n");
		}
		input.close();
	} 
}




