package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Exercises {

	/*
	 Note, for-each is preferred, and should be used when possible.
	 */

	/*
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order 
	 array2List( {"Apple", "Orange", "Banana"} )  ->  ["Apple", "Orange", "Banana"]
	 array2List( {"Red", "Orange", "Yellow"} )  ->  ["Red", "Orange", "Yellow"]
	 array2List( {"Left", "Right", "Forward", "Back"} )  ->  ["Left", "Right", "Forward", "Back"] 
	 */
	public List<String> array2List(String[] stringArray) {
		List<String> results = new ArrayList<String>();
		for(String name : stringArray){
			results.add(name);
		}
		return results;
	}

	/*
	 Given a list of Strings, return an array containing the same Strings in the same order 
	 list2Array( ["Apple", "Orange", "Banana"] )  ->  {"Apple", "Orange", "Banana"}
	 list2Array( ["Red", "Orange", "Yellow"] )  ->  {"Red", "Orange", "Yellow"}
	 list2Array( ["Left", "Right", "Forward", "Back"] )  ->  {"Left", "Right", "Forward", "Back"}
	 */
	public String[] list2Array(List<String> stringList) {
		String[] results = new String[stringList.size()];

		for(int i=0; i < stringList.size(); i++){
			//for(String name : stringList) { //for each String called name in the collection stringList
			results[i] = stringList.get(i);
		}
		return results;
	}

	/*
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order 
	 except for any words that contain exactly 4 characters.
	 no4LetterWords( {"Train", "Boat", "Car"} )  ->  ["Train", "Car"]
	 no4LetterWords( {"Red", "White", "Blue"} )  ->  ["Red", "White"]
	 no4LetterWords( {"Jack", "Jill", "Jane", "John", "Jim"} )  ->  ["Jim"]
	 */
	public List<String> no4LetterWords(String[] stringArray) { // Method declaration return will be a list that contains strings. In (), parameters, here of type string[], named stringArray
		List<String> results = new ArrayList<String>();
		for (String name : stringArray) {
			if (name.length() != 4) {
				results.add(name);
			}
		}
		return results;
	}



	/*
	 Given a List of Strings, return a new list in reverse order of the original. One obvious solution is to
	 simply loop through the original list in reverse order, but see if you can come up with an alternative
	 solution. (Hint: Think LIFO (i.e. stack))
	 reverseList( ["purple", "green", "blue", "yellow", "green" ])  -> ["green", "yellow", "blue", "green", "purple" ]
	 reverseList( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"} )
		-> ["way", "the", "all", "jingle", "bells", "jingle", "bells", "jingle"]
	 */
	public List<String> reverseList(List<String> stringList) {
		List<String> reverseList = new ArrayList<String>();
		Stack<String> helperStack = new Stack<String>();

		for(String name : stringList) { //for each String called name in the collection stringList
			helperStack.add(name);
		}
		while(helperStack.size() > 0) {// for each String called name in the collection helperStack
			reverseList.add(helperStack.pop());
		}
		return reverseList;
	}

	/*
	 Given an array of ints, divide each int by 2, and return an ArrayList of Doubles.
	 arrayInt2ListDouble( {5, 8, 11, 200, 97} ) -> [2.5, 4.0, 5.5, 100, 48.5]
	 arrayInt2ListDouble( {745, 23, 44, 9017, 6} ) -> [372.5, 11.5, 22, 4508.5, 3]
	 arrayInt2ListDouble( {84, 99, 3285, 13, 877} ) -> [42, 49.5, 1642.5, 6.5, 438.5]
	 */
	public List<Double> arrayInt2ListDouble(int[] intArray) {
		List<Double> result= new ArrayList<Double>();
		for(Integer i : intArray){
			result.add(i / 2.0);
		}
		return result;
	}

	/*
	 Given a List of Integers, return the largest value.
	 findLargest( [11, 200, 43, 84, 9917, 4321, 1, 33333, 8997] ) -> 33333
	 findLargest( [987, 1234, 9381, 731, 43718, 8932] ) -> 43718
	 findLargest( [34070, 1380, 81238, 7782, 234, 64362, 627] ) -> 64362
	 */
	public Integer findLargest(List<Integer> integerList) {
		Integer largest = integerList.get(0);
		for(Integer num: integerList) {
			if(largest < num) {
				largest = num;
			}
		}
		return largest; 
	}

	/*
	 Given an array of Integers, return a List of Integers containing just the odd values.
	 oddOnly( {112, 201, 774, 92, 9, 83, 41872} ) -> [201, 9, 83]
	 oddOnly( {1143, 555, 7, 1772, 9953, 643} ) -> [1143, 555, 7, 9953, 643]
	 oddOnly( {734, 233, 782, 811, 3, 9999} ) -> [233, 811, 3, 9999]  
	 */
	public List<Integer> oddOnly(Integer[] integerArray) {
		List<Integer> result = new ArrayList<Integer>();
		for(Integer num : integerArray) {//for each Integer called num in the Array integerArray
			if(num % 2 == 1) {
				result.add(num);
			}
		}
		return result;
	}

	/* 
	 Given a List of Integers, and an int value, return true if the int value appears two or more times in 
	 the list.
	 foundIntTwice( [5, 7, 9, 5, 11], 5 ) -> true
	 foundIntTwice( [6, 8, 10, 11, 13], 8 -> false
	 foundIntTwice( [9, 23, 44, 2, 88, 44], 44) -> true
	 */
	public boolean foundIntTwice(List<Integer> integerList, int intToFind) {
		int counter = 0;
		for(Integer value : integerList) {//for each Integer called value in the intergerList list 
			if(intToFind == value){
				counter ++;
			}
		} 
		return (counter >= 2);
	}

	/*
	 Given an array of Integers, return a List that contains the same Integers (as Strings). Except any multiple of 3
    should be replaced by the String "Fizz", any multiple of 5 should be replaced by the String "Buzz",
    and any multiple of both 3 and 5 should be replaced by the String "FizzBuzz"
	 ** INTERVIEW QUESTION **	 

    fizzBuzzList( {1, 2, 3} )  ->  [1, 2, "Fizz"]
	 fizzBuzzList( {4, 5, 6} )  ->  [4, "Buzz", 6]
	 fizzBuzzList( {7, 8, 9, 10, 11, 12, 13, 14, 15} )  ->  [7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz"]

	 HINT: To convert an integer x to a string you can call x.toString() in your code (e.g. if x = 1 then x.ToString() equals "1")
	 */
	public List<String> fizzBuzzList(Integer[] integerArray) {
		List<String> results = new ArrayList<String>();

		for(Integer value : integerArray) //for each Integer called value in the collection integerArray
			if(value %3 == 0 && value %5 == 0) {
				results.add("FizzBuzz");
			} else if(value %3 == 0) {
				results.add("Fizz");
			} else if(value %5 == 0){
				results.add("Buzz");
			} else {
				results.add(value.toString());
			}
		return results;
	}

	/*
	 Given a list of Strings, return a list that contains the distinct values. In other words, no value is to be
	 included more than once in the returned list. (Hint: Think Set)
	 distinctValues( ["red", "yellow", "green", "yellow", "blue", "green", "purple"] ) -> ["red", "yellow", "green", "blue", "purple"]
	 distinctValues( ["jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"] ) -> ["jingle", "bells", "all", "the", "way"]
	 */
	public List<String> distinctValues(List<String> stringList) {
		Set<String> result = new HashSet<String>();
		for(String color : stringList ){
			result.add(color);
		}
		List<String> resultColor = new ArrayList<String>();
		for(String finalColor : result){
			resultColor.add(finalColor);
		}
		return resultColor;
	}

	/*
	 Given two lists of Integers, interleave them beginning with the first element in the first list followed
	 by the first element of the second. Continue interleaving the elements until all elements have been interwoven.
	 Return the new list. If the lists are of unequal lengths, simply attach the remaining elements of the longer
	 list to the new list before returning it.
	 interleaveLists( [1, 2, 3], [4, 5, 6] )  ->  [1, 4, 2, 5, 3, 6]
	 */
	public List<Integer> interleaveLists(List<Integer> listOne, List<Integer> listTwo) {
		List<Integer> result = new ArrayList<Integer>();
		if(listOne.size() >= listTwo.size()) {
			int counter = 0;
			for(int i = 0; i < listTwo.size(); i++){
				result.add(listOne.get(i));
				result.add(listTwo.get(i));
				counter++;
			}
			for(int i = counter; i < listOne.size(); i++){
				result.add(listOne.get(i));
			}
		} else {
			int counter = 0;
			for(int i = 0; i < listOne.size(); i++){
				result.add(listOne.get(i));
				result.add(listTwo.get(i));
				counter++;
			}
			for(int i = counter; i < listTwo.size(); i++){
				result.add(listTwo.get(i));
			}
		}
		return result;
	}

	/*
	 Given a list of Integers representing seat numbers, group them into ranges 1-10, 11-20, and 21-30.
	 (Any seat number less than 1, or greater than 30 is invalid, and can be ignored.) Preserve the order
	 in which the seat number entered their associated group. Return a list of the grouped Integers 1-10,
	 11-20, and 21-30. (Hint: Think multiple queues)
	 boardingGate( [1, 13, 43, 22, 8, 11, 30, 2, 4, 14, 21] ) -> [1, 8, 2, 4, 13, 11, 14, 22, 30, 21]
	 boardingGate( [29, 19, 9, 21, 11, 1, 0, 25, 15, 5, 31] ) -> [9, 1, 5, 19, 11, 15, 29, 21, 25]
	 boardingGate( [0, -1, 44, 31, 17, 7, 27, 16, 26, 6] ) -> [7, 6, 17, 16, 27, 26]
	 */
	public List<Integer> boardingGate(List<Integer> seatNumberList) {
		return null;
	}

}
