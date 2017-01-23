package com.techelevator;

/*
 The Fibonacci numbers are the integers in the following sequence:  
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 
Write a command line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number.

  
 $ java Fiboncci
 
Please enter the Fibonacci number: 25
 
 0, 1, 1, 2, 3, 5, 8, 13, 21
 */

import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the a number to find the Fibonacci sequence leading up to it: ");

		int fibonacciInput = input.nextInt();
		int nextToLast = 0;
		int last = 1;

		if(fibonacciInput == 0){
			System.out.println("0");
		} else if(fibonacciInput == 1) {
			System.out.println("1");
		} else { 
			System.out.print("0 ");
			while(last < fibonacciInput) { 
				System.out.print(last + " ");
				int temp = last + nextToLast;
				nextToLast = last;
				last = temp;
			}
		}
		input.close();
	}
}



	
	





