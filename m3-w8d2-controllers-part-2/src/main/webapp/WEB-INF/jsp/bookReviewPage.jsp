

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<div class="reviewInput">
	<h1>New Book Review</h1>

	<c:url value="/bookReviewPage" var="formAction" />
	<form method="POST" action="${formAction}">
	
		<div>
			<label for="username">Username</label> <input
				type="text" id="username" name="username" /> 
		</div>
		
		<div>
			<label for="rating">Rating</label> <input
				type="text" id="rating" name="rating" />

		</div>
		<div>
			<label for="reviewTitle">Review Title</label> <input
				type="text" id="reviewTitle" name="reviewTitle" />

		</div>
		
		<div>
			<label for="reviewText">Review Text</label> <input
				type="text" id="reviewText" name="reviewText" />

		</div>
		
		<input
				type="submit" value="Submit" />
	</form>
</div>
