window.onload = function() {
	
// Given two int values, return their sum. Unless the two values are the same,
// then return double their sum.
console.log("Sum Double");
console.log(sumDouble(1,2));
console.log(sumDouble(3,2));
console.log(sumDouble(2,2));

	function sumDouble(x, y) {
		if(x === y) {
			return (x + y) * 2;
		} else { 
			return x + y;
		}
	}


// We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
// Given 3 int values, return true if 1 or more of them are teen.
console.log("Has Teen");
console.log(hasTeen(13,20,10));
console.log(hasTeen(20,19,10));
console.log(hasTeen(20,10,13));
console.log(hasTeen(20,10,42));


	function hasTeen(a, b, c){
		
		function isTeen(z) {
			return z >= 13 && z <=19;
		}
		if(isTeen(a)){
			return true;
		}
		if(isTeen(b)){
			return true;
		}
		if(isTeen(c)){
			return true;
		}
		return false;
	}

	


// Given two non-negative int values, return true 
// if they have the same last digit, such as with 27 and 57.
console.log("lastDigit");
console.log(lastDigit(7, 17));
console.log(lastDigit(6, 17));
console.log(lastDigit(3, 113));

	function lastDigit(x, y){
		if(x % 10 === y % 10){
			return true;
		}
		return false;
		}
		

// SeeColor Given a string, if the string begins with "red" or 
// "blue" return that color string, otherwise return the empty string.
console.log(seeColor("redxx")); 
console.log(seeColor("xxred")); 
console.log(seeColor("blueTimes")); 

	function seeColor(a){
		if(a.substring(0, 3) === "red"){
			return "red";
		} 
		if(a.substring(0, 4) === "blue"){
			return "blue";
		}
		return "";

	}


// MiddleThree Given a string of odd length, return the string length 3 
// from its middle, so "Candy" yields "and". The string length will be at least 3.
console.log("Middle Three")
console.log(middleThree("Candy"));
console.log(middleThree("and"));
console.log(middleThree("solving")); 

	function middleThree(str){

		var middleOfString = str.length / 2;
		var middleThree = str.substring(middleOfString - 1, middleOfString + 2);
		return middleThree;
	}

		




// FrontAgain Given a string, return true if the first 2 chars in the string
 // also appear at the end of the string, such as with "edited".
console.log("Front Again");
console.log(frontAgain("edited"));
console.log(frontAgain("edit")); 
console.log(frontAgain("ed"));

	function frontAgain(str){
		if(str.substring(0, 2) === str.substring(str.length-2)) {
			return true;
		}
			return false;
		}


// AlarmClock Write a function that given a day of the week encoded as 0=Sun,
 // 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, 
 // displays the weekday name, and the time in the form of "7:00" indicating when 
 // the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the 
 // weekend it should be "10:00". Unless we are on vacation -- then on weekdays 
 // it should be "10:00" and weekends it should be "off".
console.log("Alarm Clock");
console.log(alarmClock(1, false)); 
console.log(alarmClock(5, true)); 
console.log(alarmClock(0, false));
console.log(alarmClock(6, true)); 

	function alarmClock(day, vacation){
		var myMap = new Map();
			myMap.set(0, "Sunday");
			myMap.set(1, "Monday");
			myMap.set(2, "Tuesday");
			myMap.set(3, "Wednesday");
			myMap.set(4, "Thursday");
			myMap.set(5, "Friday");
			myMap.set(6, "Saturday");

			if((day === 0 || day === 6) && vacation){
				return myMap.get(day) + " off";
			}
			if((day === 0 || day === 6) && !vacation){
				return myMap.get(day) + " 10:00";
			}
			if((day >= 1 && day <= 5) && vacation){
				return myMap.get(day) + " 10:00";
			}
			if((day >= 1 && day <= 5) && !vacation){
				return myMap.get(day) + " 7:00";
			}

	}

// MakeMiddle Write a function that given an array of ints of even length, 
// returns a new array length 2 containing the middle two elements from the 
// original array. If the original array length is not even, or at least 2 
// elements in length, return an empty array.
console.log("Make Middle");
console.log(makeMiddle([1, 2, 3, 4]));  /* → [2, 3]*/
console.log(makeMiddle([7, 1, 2, 3, 4, 9]));    /*→ [2, 3]*/
console.log(makeMiddle([1, 2]));  /* → [1, 2]*/
	
	function makeMiddle(i){

		var numbersArray = [];
			if ((numbersArray.length % 2 != 0) || numbersArray.length < 2){
				return "";
			} else {

		for(var i=0; 1 < numbersArray.lenght; i++){
		numbersArray.push(i);

		return numbersArray.length;
		}	
	





// OddOnly Write a function that given an array of integer of any length, 
// filters out the even number, and returns a new array of just the the odd numbers.
console.log("Odd Only")
console.log(oddOnly([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]));  /*→ [1, 3, 5, 7, 9, 11]; */
console.log(oddOnly([2, 4, 8, 32, 256]));     /*→ []*/


	function oddOnly(values) {
	    return values.filter(function (num) {
	    	return num %2 === 0;
	    });
	}


// Weave Write a function that given two arrays, interleaves the two arrays one 
//element from each array at a time to return a new array made up of the interwoven 
//elements of the original two arrays.
// console.log("Weave");
// console.log(weave([1, 3, 5], [2, 4]));   /* → [1, 2, 3, 4, 5] */
// console.log(weave([1, 3, 5], [2, 4, 6, 8]));    /*→ [1, 2, 3, 4, 5, 6, 8]*/

// 	function weave(array1, array2) {
// 		var interleaveArray = [];
//         var counter = 0;
//         if(array1.length >= array2.length) {
//         	for(i = 0; i < array2.length; i++){
//         		interleaveArray.push(array1[i]);
//         		interleaveArray.push(array2[i]);
//         		counter ++;
//         	}
//         	for(i = counter; i < array1.length; i++){	
//         		interleaveArray.push(array1[i]);
// 			} else {
// 			for(i = 0; i < array1.length; i++){
//         		interleaveArray.push(array1[i]);
//         		interleaveArray.push(array2[i]);
//         		counter ++;
//         	}
//         	for(i = counter; i < array2.length; i++){
//         		interleaveArray.push(array2[i]);
// 			} 
//        		}
//        }
//        return weave;
//     }

// var combined = [];
//     if(array1.length >= array2.length) {
//     for (var i = 0; i < array1.length; i++) {
//         combined.push(array1[i]);
//         combined.push(array2[i]);
// 	return combined;
// 	} 
// 	if(array2.length >= array1.length)
// 	for (var i = 0; i < array2.length; i++) {
//     combined.push(array1[i]);
//     combined.push(array2[i]);
// 	return combined;
// }
// }
// return null;
// }
	




// CigarParty When squirrels get together for a party, they like to have cigars.
// A squirrel party is successful when the number of cigars is between 40 and 60, 
//inclusive. Unless it is the weekend, in which case there is no upper bound on the
// number of cigars. Write a squirrel party function that return true if the party
//with the given values is successful, or false otherwise.
console.log("Cigar Party");
console.log(cigarParty(30, false));   /* → false*/
console.log(cigarParty(50, false));   /* → true*/
console.log(cigarParty(70, true));    /* → true*/

	function cigarParty(cigars, isWeekend){
	cigarInRange = (cigars >= 40 && cigars <= 60);
	weekendCigar = (cigars >= 40);
		if(isWeekend) {
			if(weekendCigar) { 
				return true; 
			} else {
				return false; 
			}
		} else {
			if(cigarInRange) {
				return true;
			} else {
				return false;
			}
		}
	}






// StringSplosion Write a function that given a non-empty string like "Code" 
//returns a string like "CCoCodCode".
console.log("String Splosion");
console.log(stringSplosion("Code"));   /*→ "CCoCodCode"*/
console.log(stringSplosion("supercalifragilisticexpialidocious"));  /*→ "ssusupsupesupersupercsupercasupercalsupercalisupercalifsupercalifrsupercalifrasupercalifragsupercalifragisupercalifragilsupercalifragilisupercalifragilissupercalifragilistsupercalifragilistisupercalifragilisticsupercalifragilisticesupercalifragilisticexsupercalifragilisticexpsupercalifragilisticexpisupercalifragilisticexpiasupercalifragilisticexpialsupercalifragilisticexpialisupercalifragilisticexpialidsupercalifragilisticexpialidosupercalifragilisticexpialidocsupercalifragilisticexpialidocisupercalifragilisticexpialidociosupercalifragilisticexpialidociousupercalifragilisticexpialidocious" */

	function stringSplosion(str){
		var splosion = "";
		for (i = 0; i < str.length; i++) {
			splosion = splosion + str.substring(0, i + 1);
		}
		return splosion;
	}



// FizzBuzz Because you know you can't live without it, FizzBuzz.

// Based on a traditional English children's game.
//     Print the numbers 1..100
//     For multiples of 3, print "Fizz" instead of the number
//     For multiples of 5, print "Buzz" instead of the number
//     For multiples of 3 and 5, print "FizzBuzz" instead of the number

// fizzBuzz() →    
//     1
//     2
//     Fizz
//     4
//     Buzz
//     Fizz
//     7
//     8
//     Fizz
//     Buzz
//     11
//     Fizz
//     13
//     14
//     FizzBuzz
//     .
//     .
//     .
console.log("Fizz Buzz");
console.log(fizzBuzz());

	function fizzBuzz(i) {
		for (var i=1; i <= 100; i++){
   			if (i % 15 == 0)
        		console.log("FizzBuzz");
    		else if (i % 3 == 0)
       			 console.log("Fizz");
    		else if (i % 5 == 0)
       			 console.log("Buzz");
    		else
       			 console.log(i);
		}
	}

// CountValues Write a function that accepts an array of integer values, 
//count of the number of times each value is found in the array, and then 
//display the values and their count.
//     1 : 1
//     99 : 3
//     43 : 1
//     2 : 2
//     55 : 1
//     78 : 1
//     2345 : 1
//     438 : 1
//     107 : 1
console.log("Count Values");
console.log(countValues([1, 99, 43, 2, 55, 78, 99, 2345, 438, 2, 99, 107]));
	
	function countValues(values, num){
		var count = 0;
		var num;
		for(i = 0; i < values.length; i++){
			if(values[i] === num) {
				count ++;
			}
			return num + " : " + count;
		}
	}


// ReverseArray Write an function that accepts an array of integer values, 
//and display them in the reverse order they appeared in the array. One obvious 
//solution is to simply loop through the integer array in reserve order, but see
// if you can come up with an alternative.
console.log("Reverse Array");
console.log(reverseArray([1, 99, 43, 2, 55, 78, 99, 2345, 438, 2, 99, 107])); /* → 
 1 99 43 2 55 78 2345 438 107 */

 	function reverseArray(values){
 		var values = [];
 		values.reverse();
 	}



// BlackJack Write a function that given 2 int values greater than 0, returns 
//whichever value is nearest to 21 without going over. Return 0 if they both go over.
console.log("Black Jack");
console.log(blackjack(19, 21));  /* → 21*/
console.log(blackjack(21, 19));  /*→ 21*/
console.log(blackjack(19, 22));  /*→ 19*/
}

	function blackjack(x, y){
		if(x > 21 && y > 21)
			return 0;
		else if(x > 21)
			return y;
		else if(y > 21)
			return x;
		else if(Math.abs(21 - x) > Math.abs(21 - y))
			return y;
		else
			return x;
	}
