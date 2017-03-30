/// <reference path="../jquery-3.1.1.js" />
/// <reference path="../jquery.validate.js" />

$(document).ready(function () {

	// Email address - required
	// Email address - .gov only (BONUS)
	// Password - required, length 8 or more
	// ConfirmPassword

	$('#register form').validate({
		errorClass: "field-validation-error",
		rules: {
			email: {
				email: true,                           
				required: true,
				govEmail: true
			},
			password: {
				required: true,       
				minlength: 8,    
			},
			confirmPassword: {
				equalTo: "#password"
			}
		},

	});

	// Email address - required
	// Password - required
	$('#login form').validate({
		errorClass: "field-validation-error",
		rules: {
			email: {
				email: true,                           
				required: true,
				govEmail: true
			},
			password: {
				required: true,       
				minlength: 8           
			},
		},		
	});

	$("#checkout").validate({
		rules: {
			BillingAddress1: { required: true },
			BillingCity: { required: true },
			BillingState: { required: true, stateUS: true },
			BillingPostalCode: { required: true , zipUS: true },

			ShippingAddress1: { required: true },
			ShippingCity: { required: true },
			ShippingState: { required: true, isstate: true },
			ShippingPostalCode: { required: true },

			// <fieldset id="shipping-info">
			ShippingType: { required: true },
			// Payment
			NameOnCard: { required: true },
			CreditCardNumber: { required: true, creditCard: true },
			ExpirationDate: { required: true, ExpDate_mm_yy: true }
		},

		messages: {
			BillingAddress1: { required: "Billing Address is required" },
			BillingCity: { required: "Billing City is required" },
			BillingState: { required: "Billing State is required" },
			BillingPostalCode: { required: "Billing Postal Code is required" },
			ShippingAddress1: { required: "Shipping Address is required" },
			ShippingCity: { required: "Shipping City is required" },
			ShippingState: { required: "Shipping State is required" },
			ShippingPostalCode: { required: "Shipping Postal Code is required" },
			ShippingType: {required: "choose one " },
			NameOnCard: { required: "There has to be a Name on Card" },
			CreditCardNumber: { required: "Card number is requird" },
			ExpirationDate: { required: "Expiration date is requird" },
		},

	});

});

$.validator.addMethod("govEmail", function (value, index) {
	return value.toLowerCase().endsWith(".gov");  
}, "Please enter a .gov email");

$.validator.addMethod("isstate", function(value) {
	var states = [
		"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA",
		"HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD",
		"MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ",
		"NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC",
		"SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY",
		"AS", "DC", "FM", "GU", "MH", "MP", "PR", "PW", "VI"
		];
	return $.inArray(value.toUpperCase(), states) != -1;
}, "Data provided is not a valid state");

$.validator.addMethod("zipUS", function(value, element) {
	return /(^\d{5}$)|(^\d{5}-\d{4}$)/.test(value);
}, "Please specify a valid US zip code.");

$.validator.addMethod("creditCard", function(value, element) {
	return this.optional(element) || /^\d{15}(\d{1})?$/.test(value);
}, "Please provide a valid credit card number.");

$.validator.addMethod('ExpDate_mm_yy', function (value, element){
	return this.optional(element) || /^(0[1-9]|1[0-2])\/([2-3][0-9])$/.test(value);
}, "This is not a valid expiration date");







