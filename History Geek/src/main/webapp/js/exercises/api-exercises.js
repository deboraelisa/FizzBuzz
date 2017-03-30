/// <reference path="../jquery-3.1.1.js" />


$(document).ready(function () {
	$('#BillingPostalCode').blur(function() {
		var billingZipCode = $("#BillingPostalCode").val();
		var subtotal = $("#subtotal .price").text().substr(1);
		$.ajax({
			url: "/m4-java-historygeek-exercises/api/getTax?" +
			"billingZipCode="+billingZipCode+
			"&subtotal="+subtotal,
			type: "GET",
			dataType: "json",
			success: function(data) {
				$("#tax .price").text("$"+data.tax.toFixed(2));
				calculateGrandTotal();
			},
			failure: {
				function (xhr, status, error) {
					console.log(error);
				}
			}
		});
	});
});

function calculateGrandTotal(){
	var shippingCost = $('#shipping-info :checked').attr('data-cost');
	if(shippingCost != null){
		$('#shipping .price').text('$'+shippingCost);
		var tax = $('#tax .price').text();
		var subTotal = $('#subtotal .price').text();
		var totalPrice = parseFloat(shippingCost) + parseFloat(tax.substr(1))+ parseFloat(subTotal.substr(1));
		totalPrice = (totalPrice).toFixed(2);
		$('#grandtotal .price').text('$'+totalPrice);
	}
};

