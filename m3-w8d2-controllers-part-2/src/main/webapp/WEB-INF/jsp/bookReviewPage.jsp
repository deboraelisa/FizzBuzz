

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
			<label for="title">Review Title</label> <input
				type="text" id="title" name="title" />

		</div>
		
		<div>
			<label for="text">Review Text</label> <input
				type="text" id="text" name="text" />

		</div>
		
		<input
				type="submit" value="Submit" />
	</form>
</div>
