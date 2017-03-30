//$(document).ready(function () {
//    //modeled after toggle.js in lecture notes W11D2
//	var socket = new SockJS('ws-connect');
//	var connection= Stomp.over(socket);
//	
//	
//	var handleChat = 
//	var errorCallback = function(error){
//		console.log(error);
//	}
//	
//	var successCallback = function(frame){ //frame is websocket terminology
//		console.log("Connected: " + frame);
//		
//		connection.subscribe('/topic/chat', function(message) {//chat is from ChatController
//			var messageObject = JSON.parse(message.body);
//			console.log("NEW MESSAGE: " + message);
//		}); 
//				
//		var pTag = $('<p>').addClass('message');
//		
//		var userSpan = $('<span>').addClass('username').text(messageObject.userName);
//		pTag.append(userSpan);
//		
//		var hours = messageObjet.sentDate.hour;
//		var amPm = hours >= 12 ? 'PM' : 'AM';
//		if(hours > 12){
//			hours = hours - 12;
//		}
//		
//		var timeSpan = $('<span>').addClass('time').text(hours + messageObect.sentDate.hour + ':' + messageObject.sentDate.minute + amPm);
//		pTag.append(timeSpan);
//		pTag.append($('<br>'));
//		pTag.append(messageObject.message);
//		
//		select('#history').append(pTag);
//		
//		var handleUser = 
//			var userArray = JSON.parse(member.body);
//		$('#members ul').empty(); //empty will clear previous
//		
//		for(var i = 0; i <userArray.length; i++){
//			var item = $('<li>').text(userArray[i]);
//			$('#members ul').append(item);
//		}
//		
//		
//		connection.subscribe('/topic/members', function(member){//delete this?
//			console.log("USER " + member);
//		})
//		connection.subscribe('/topic/members', handleUser);
//	
//	};
//	
//	connection.connect({}, successCallback, errorCallback);
//	
//	$('#newMessageForm button').on('click', function(event){
//		var message = {
//				id: 1,
//				userID: 1,
//				message: $('#newMessageForm textarea').val()
//		};
//		
//		console.log("SENDING: " + message);
//		
//		connection.send('/app/chat', {}, JSON.stringify(message));
//		
//		$('#newMessageForm textarea').val();
//	});
//});
//
//
//
//
//
//
//
//

﻿$(document).ready(function () {
	var socket = new SockJS('ws-connect');
	var connection = Stomp.over(socket);
	
	var handleChat = function(message) {
		var messageObject = JSON.parse(message.body);
		var pTag = $('<p>').addClass('message');
		
		var userSpan = $('<span>').addClass('username').text(messageObject.userName);
		pTag.append(userSpan);
		
		var hours = messageObject.sentDate.hour;
		var amPm = hours >= 12 ? 'PM' : 'AM';
		if(hours > 12) {
			hours = hours - 12;
		}
		
		var timeSpan = $('<span>').addClass('time').text(hours + ':' + messageObject.sentDate.minute + ' ' + amPm);
		pTag.append(timeSpan);
		pTag.append($('<br>'));
		pTag.append(messageObject.message);
		
		$('#history').append(pTag);
	};
	
	var handleUser = function(member) {
		var userArray = JSON.parse(member.body);
		
		$('#members ul').empty();
		
		for(var i = 0; i < userArray.length; i++) {
			var item = $('<li>').text(userArray[i]);
			$('#members ul').append(item);
		}
	};
	
	var errorCallback = function(error) {
		console.log(error);
	};
	
	var successCallback = function(frame) {
		console.log("Connected: " + frame);
		
		connection.subscribe('/topic/members', handleUser);
		connection.subscribe('/topic/chat', handleChat);
	};
	
	connection.connect({}, successCallback, errorCallback);
	
	$('#newMessageForm button').on('click', function(event) {
		var message = {
			message: $('#newMessageForm textarea').val()
		};
		
		console.log("Sending: " + message);
		
		connection.send('/app/chat', {}, JSON.stringify(message));
		
		$('#newMessageForm textarea').val('');
		
		return false;
	});
});