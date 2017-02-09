package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class KataRomanNumerals {
	protected Map<Integer, String> decimalToRoman = new HashMap<Integer, String>(); 

	String value = "";
	String tens = "";
	String valueTens = "";
	String valueHundreds = "";
	String hundreds = "";
	String valueThousands = "";
	String thousands = "";
	int i = 0;

	public String decimalToRoman (int decimal) {

		decimalToRoman.put(1000, "M");
		decimalToRoman.put(900, "CM");
		decimalToRoman.put(800,	"DCCC");
		decimalToRoman.put(700, "DCC");
		decimalToRoman.put(600, "DC");
		decimalToRoman.put(500, "D");
		decimalToRoman.put(400, "CD");
		decimalToRoman.put(300, "CCC");
		decimalToRoman.put(200, "CC");
		decimalToRoman.put(100, "C");
		decimalToRoman.put(90, "XC");
		decimalToRoman.put(80, "LXXX");
		decimalToRoman.put(70, "LXX");
		decimalToRoman.put(60, "LX");
		decimalToRoman.put(50, "L");
		decimalToRoman.put(40, "XL");
		decimalToRoman.put(30, "XXX");
		decimalToRoman.put(20, "XX");
		decimalToRoman.put(10, "X");
		decimalToRoman.put(9, "IX");
		decimalToRoman.put(8, "VIII");
		decimalToRoman.put(7, "VII");        
		decimalToRoman.put(6, "VI");
		decimalToRoman.put(5, "V");
		decimalToRoman.put(4, "IV");
		decimalToRoman.put(3, "III");
		decimalToRoman.put(2, "II");
		decimalToRoman.put(1, "I");

	
		if(decimalToRoman.containsKey(decimal)) {
			return decimalToRoman.get(decimal);
		} else if(decimal >= 1 && decimal <=10) {
			return decimalToRoman.get(decimal);
		} else if(decimal > 10 && decimal < 100){
			String tens = (decimalToRoman.get(decimal - (decimal % 10))) + (decimalToRoman.get(decimal % 10));
			valueTens = tens;
			return valueTens;
		} else if(decimal >= 100 && decimal < 1000) {
			String hundreds = (decimalToRoman.get(decimal - (decimal % 100))) + saveTens(decimal % 100);
			valueHundreds = hundreds;
			return valueHundreds; 
		}	else if(decimal >= 1000 && decimal < 3000) {
//			String firstPart = decimalToRoman.get(decimal - (decimal % 1000));
//			String secondPart = decimalToRoman.get(decimal % 1000 - decimal % 100);
			
			thousands = (decimalToRoman.get(decimal - (decimal % 1000))) + decimalToRoman.get(decimal % 1000 - decimal % 100) + saveTens(decimal % 100);
			valueThousands = thousands;
			return valueThousands;
		} else {
			return value;
		}
	}

	private String saveTens(int decimal) {
		tens = (decimalToRoman.get(decimal - (decimal % 10))) + (decimalToRoman.get(decimal % 10));
		valueTens = tens;
		return valueTens;
	}

	private String saveHundreds(int decimal) {
		hundreds = (decimalToRoman.get(decimal - (decimal % 100))) + (saveTens(decimal));
		valueHundreds = hundreds;
		return valueHundreds;
	}
}

//private String saveThousands(int decimal) {
//thousands = (decimalToRoman.get(decimal - (decimal % 1000))) + (saveHundreds(decimal));
//valueThousands = thousands;
//return valueThousands;
//}


//public final static String toRoman(int number) {
//int l =  map.floorKey(number);
//if ( number == l ) {
//  return map.get(number);
//}
//return map.get(l) + toRoman(number-l);
//}

//The Romans wrote numbers using letters - I, V, X, L, C, D, M. 
//(notice these letters have lots of straight lines and are hence 
//easy to hack into stone tablets)
//
//The Kata says you should write a function to convert from normal
//numbers to Roman Numerals: eg
//
//*Sample Output*
//```
//1 ---> I
//10 --> X
//7 ---> VII
//```
//
//There is no need to be able to convert numbers larger than about
//3000. (The Romans themselves didn't tend to go any higher)
//
//Note that you can't write numerals like "IM" for 999. Wikipedia
//		says: Modern Roman numerals ... are written by expressing 
//		each digit separately starting with the left most digit 
//		and skipping any digit with a value of zero. To see this 
//in practice, consider the ... example of 1990. In Roman numerals
//1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008
//is written as 2000=MM, 8=VIII; or MMVIII.
////
//**Clues**
//- what are the best data structures for storing all the numeral 
//		letters? (I, V, D, M etc)
//
//[How Roman Numerals Work](http://www.novaroma.org/via_romana/numbers.
//				html)
//
//### Step 2
//
//Write a function to convert in the other direction from Roman
//Numeral to digit.