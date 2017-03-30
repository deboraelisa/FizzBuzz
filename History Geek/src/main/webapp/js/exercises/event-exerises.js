/// <reference path="../jquery-3.1.1.js" />

$(document).ready(function () {
	var x = 0;
	var y = 0;

	var url = (window.location).href; 
	var id = url.substring(url.lastIndexOf('/') + 1);
	var maxX = id; 
	var maxY = id;

//	Bind to the keydown event and listen for left, right, up and down keys to move the ship.
	$(document).on('keydown', function(event) {
		if(event.key === "ArrowRight"){
			if(x < maxX - 1){
				moveShip(function(){ x++;});
				//$('#row_'+y+'_column_'+x).removeClass('ship'); replaced with function below
//				$(posSelector()).removeClass('ship');
//				x++;
//				$(posSelector()).addClass('ship');
			}
//			console.log("Go Right"); this displays what happens on the console in Chrome
			return false;

		} else if(event.key === "ArrowLeft"){
			if(x > 0){
				moveShip(function(){ x--;});
//				$(posSelector()).removeClass('ship');
//				x--;
//				$(posSelector()).addClass('ship');
			}
			return false;
		} else if(event.key === "ArrowUp"){
			if(y > 0){
				moveShip(function(){ y--;});
			}
			return false;
		} else if(event.key === "ArrowDown"){
			if(y < maxY - 1){
				moveShip(function(){ y++;});
			}
			return false;
		}
//		return false; moved to inside each if(statement) 
	});


	function posSelector(){ //created function that repeats for each movement
		return '#row_' + y + '_column_' + x;
	}

	function moveShip(modifier){
		$(posSelector()).removeClass('ship');
		modifier();
		if($(posSelector()).hasClass("iceberg") || $(posSelector()).hasClass("pirate") || $(posSelector()).hasClass("treasure")){ restartGame();}
		$(posSelector()).addClass('ship');

	}

	function restartGame(){
		x = 0;
		y = 0;	
	}
//	Bind the restart button to a click to reset the status of the game board.
	$('#btnRestart').on("click", function (event) {
		$(posSelector()).removeClass('ship');
		restartGame();
		$(posSelector()).addClass('ship');
	});


//	When the My Shipping Address is the same is clicked, copy the contents of 
//	the Billing Address fields into the Shipping Address fields.
//	id of form is SameShipping
	$('#SameShipping').on('change', function() {
		if($(this).is(':checked')) {
			var add1 = $('#BillingAddress1').val();
			var add2 = $('#BillingAddress2').val();
			var city = $('#BillingCity').val();
			var state = $('#BillingState').val();
			var zip = $('#BillingPostalCode').val();

			$('#ShippingAddress1').val(add1);
			$('#ShippingAddress2').val(add2);
			$('#ShippingCity').val(city);
			$('#ShippingState').val(state);
			$('#ShippingPostalCode').val(zip);
		} else {
			$('#ShippingAddress1').val('');
			$('#ShippingAddress2').val('');
			$('#ShippingCity').val('');
			$('#ShippingState').val('');
			$('#ShippingPostalCode').val('');
		}
	});

	//When the user selects a shipping method, copy the shipping price into 
	//the Order Summary section and update the Grand Total

	$('#shipping-info').on('change', function() {
		var shippingCost = $('#shipping-info :checked').attr('data-cost');
		$('#shipping .price').text('$'+shippingCost);
		var tax = $('#tax .price').text();
		var subTotal = $('#subtotal .price').text();
		var totalPrice = parseFloat(shippingCost) + parseFloat(tax.substr(1))+ parseFloat(subTotal.substr(1));
		totalPrice = (totalPrice).toFixed(2);
		$('#grandtotal .price').text('$'+totalPrice);
		
	
//	
//	$('#shipping-info').on('change', function() {
//		var shippingCost = $('#shipping-info :checked').attr('data-cost');
//		$('#shipping .price').text('$' + shippingCost);
//		var tax = $('#tax .price').text();
//		var subTotal = $('#subtotal .price').text();
//		var totalPrice = parseFloat(shippingCost) + parseFloat(tax.substring(1)) + parseFloat(subTotal.substring(1));
//		totalPrice = (totalPrice).toFixed(2);
//		$('#grandTotal .price').text('$' + totalPrice);
		
//		console.log($('#shipping .price'));
//		console.log($(this).attr('data-cost'));
		
		
		
		//		var shipPrice = $('input[name=ShippingType]:checked').val();
//		console.log($('input[name=ShippingType]:checked').val());
	//	$('#shipping .price').val(shipPrice);
		//still need to inpput and add shipping price to total
	});

});




