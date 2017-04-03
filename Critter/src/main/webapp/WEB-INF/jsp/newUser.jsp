<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/header.jsp" />

<script type="text/javascript">
	$(document).ready(function () {
	
		$("#signUp").validate({
			
			rules : {
				userName : {
					required : true
				},
				password : {
					required : true,
					notMoreThan2: true,
					strongPassword: true,
 					minlength: 10,
					maxlength: 128,
				},
				confirmPassword : {
					required : true,	
					equalTo : "#password"  
				}
			},
			messages : {			
				confirmPassword : {
					equalTo : "Passwords do not match"
						
				}
			},
			errorClass : "error"
		});
	});

 	$.validator.addMethod("strongPassword", function(value, index) {
		return value.match(/[A-Z]/) &&
		        value.match(/[a-z]/) &&
				value.match(/[0-9]/) &&
				value.match(/[!@#\$%^&\* ]/);
		}, "Please enter at least 1 uppercase character, 1 lowercase character, 1 digit and 1 special character.");

	$.validator.addMethod("notMoreThan2", function(value, index) {
		return !value.match(/(.)\1{2}/);
	}, "Please don't use more than 2 identical characters in a row.");
	
	

</script>

<c:url var="formAction" value="/users" />
<form  id="signUp" method="POST" action="${formAction}">
	<div class="row">
		<div class="col-sm-4"></div>
		<div class="col-sm-4">
			<div class="form-group">
				<label for="userName">User Name: </label>
				<input type="text" id="userName" name="userName" placeHolder="User Name" class="form-control" />
			</div>
			<div class="form-group">
				<label for="password">Password: </label>
				<input type="password" id="password" name="password" placeHolder="Password" class="form-control" />
			</div>
			<div class="form-group">
				<label for="confirmPassword">Confirm Password: </label>
				<input type="password" id="confirmPassword" name="confirmPassword" placeHolder="Re-Type Password" class="form-control" />	
			</div>
			<button type="submit" class="btn btn-default">Create User</button>
		</div>
		<div class="col-sm-4"></div>
	</div>
</form>
		
<c:import url="/WEB-INF/jsp/footer.jsp" />