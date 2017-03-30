/// <reference path="../jquery-3.1.1.js" />
//Locate all <div> elements and add the 'president' class.
function presentialDivs() {

    $("#presidents").children("div").addClass("president");

}

//Locate George Washington and add the 'founding-father' class
function georgeWashington() {

    $("#george-washington").addClass("founding-father");

} 

//Locate all Republican presidents and add the 'red' class.
function republicanPresidents() {

    $(".Republican").addClass("red");

}

//Locate all Democrat presidents and add the 'blue' class.
function democratPresidents() {

    $(".Democratic").addClass("blue");

}

//Locate all Federalist presidents and add the 'gold' class.
function otherPresidents() {

	$('#presidents > div').not('.Republican,.Democratic').addClass('gold');
	//$("#presidents > div:not('.Republican,.Democratic')").addClass('gold');

}

//Locate all presidents named 'James' and add the 'james' class.
function presidentsNamedJames() {

	$("[id^=james]").addClass('james');

//    var presidents = $("#presidents").children("div");
//
//    presidents.each(function () {
//        if ($(this).children("h3").text().startsWith("James")) {
//            $(this).addClass("james");
//        }
//    });

}

//Locate each president serving at the beginning of each century and add the 'beginningOfCentury' class.
function turnOfTheCenturyPresidents() {

	
	
	$('#presidents > h2').next().addClass('beginningOfCentury');

}   

//Locate each president serving at the end of the century and add the 'endOfCentury' class.
function endOfTheCenturyPresidents() {
	$('#presidents > h2').prev().addClass('endOfCentury');
	//to pass the test for current president:
	$('#presidents > #donald-trump'). addClass('endOfCentury');


}

//Locate each president serving at the end of the century and add the 'endOfCentury' class.
function endOfTheCenturyPresidents() {
    
    $("#presidents h2").prev("div").addClass("endOfCentury");
   // $("#presidents").children().last().addClass("endOfCentury");

}

//Locate all presidents serving in the 1900s who appear on currency and add the 'appearOnCurrency' class.
function currencyPresidents() {

	//both work, second one is easier to debug
//	$('#presidents > h2:contains(1900s)').nextUntil('h2:contains(2000s)').filter('.currency').addClass('appearOnCurrency');
	$('#presidents').children('h2:contains(1900s)').nextUntil('h2:contains(2000s)').filter('.currency').addClass('appearOnCurrency');

    var headings = $("h2");


    headings.each(function () {
        if ($(this).text() == "1900s") {
            $(this).nextUntil("h2", ".currency").addClass("appearOnCurrency");
        }
    });
}