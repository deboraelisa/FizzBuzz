package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DeliveryCostComparison {
	public static void main(String[] args){

		List<DeliveryDriver> rate = new ArrayList<DeliveryDriver>();
		
		DeliveryDriver firstClass = new PostalServiceFirstClass();
		DeliveryDriver secondClass = new PostalServiceSecondClass();
		DeliveryDriver thirdClass = new PostalServiceThirdClass();
		DeliveryDriver fedex = new FedEx();
		DeliveryDriver spuFourDay = new SPUFourDayGround();
		DeliveryDriver spuTwoDay = new SPUTwoDayBusiness();
		DeliveryDriver spuNextDay = new SPUNextDay();

		rate.add(firstClass);
		rate.add(secondClass);
		rate.add(thirdClass);
		rate.add(fedex);
		rate.add(spuFourDay);
		rate.add(spuTwoDay);
		rate.add(spuNextDay);

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the weight of the package:");
		int weight = input.nextInt();
		input.nextLine();

		System.out.println("(P)ounds or (O)unces?");
		String unit = input.nextLine();
		if(unit.equalsIgnoreCase("P")) {
			weight = weight * 16;
		}
                
		System.out.println("What distance (in miles), will it be traveling to?");
		int distance = input.nextInt();
		input.nextLine();

		
		
		String [] deliveryOptions = new String[7]; {
		deliveryOptions[0] = "Postal Service (1st Class)";
		deliveryOptions[1] = "Postal Service (2nd Class)";
		deliveryOptions[2] = "Postal Service (3rd Class)";
		deliveryOptions[3] = "Fedex";
		deliveryOptions[4] = "SPU (4-day ground)";
		deliveryOptions[5] = "SPU (2-day business)";
		deliveryOptions[6] = "SPU (next-day)";
		}
		
		System.out.println("Delivery Method" + "\t\t\t" + "$ Cost");
		System.out.println("--------------------------------------");
		
		
		for(int i = 0; i < 7; i++) {
			System.out.print(deliveryOptions[i]);
			System.out.print("\t" + "$");
			System.out.printf("%.2f",rate.get(i).calculateRate(weight, distance));
			System.out.println();
			
		}	
	}
	}
	
	//Delivery Method                 $ cost
	//--------------------------------------
	//Postal Service (1st Class)      $15.98
	//Postal Service (2nd Class)      $1.65
	//Postal Service (3rd Class)      $0.84
	//FexEd                           $20.00
	//SPU (4-day ground)              $1.75
	//SPU (2-day business)            $17.50
	//SPU (next-day)                  $26.25
	
