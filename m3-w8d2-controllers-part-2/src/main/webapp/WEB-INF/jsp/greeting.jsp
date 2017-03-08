<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>





<!DOCTYPE html>
<html>
<head>
<title>Hello Spring MVC</title>
<meta name="viewport" content="width=device-width" />
<c:set var="title" value="${param.title}" />
<c:if test="${empty title}">
	<c:set var="title" value="BookReview" />
</c:if>
<!--  -->
<link rel="stylesheet" href="site.css" />

</head>
<body>
	<img src="img/forDummies.png" />

	<h1>Reviews for best selling book, "Squirrel Parties for Dummies"
		by Craig Castelaz.</h1>
	<section class="marketingBlaBlaBla">
		<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis
			imperdiet lorem in urna accumsan, sed consequat arcu tincidunt. Duis
			pretium lectus ac elit pretium, ut interdum felis aliquet. Ut varius,
			nisi eget venenatis hendrerit, lorem neque mattis nisl, vel feugiat
			libero sapien sit amet purus. Duis lobortis, nisi in dignissim
			congue, lacus ipsum posuere diam, eget lacinia ex elit in leo. Aenean
			non dui sagittis, aliquam turpis a, lacinia lacus. Mauris at
			hendrerit odio. Fusce tristique hendrerit aliquam.</p>
	</section>

	<h3>Previous reviews:</h3>
	<hr>
	<c:forEach var="review" items="${reviewList}">
		<div>
			<h2>${review.title}</h2> <p>(${review.username})</p>
			<p>${review.dateSubmitted}</p>
			<div class="rating_div">
				<c:choose>
					<c:when test="${review.rating == 5}">
						<img class="rating5" src="img/star.png">
						<img class="rating5" src="img/star.png">
						<img class="rating5" src="img/star.png">
						<img class="rating5" src="img/star.png">
						<img class="rating5" src="img/star.png">

					</c:when>
					<c:when test="${review.rating >4}">
						<img class="rating4" src="img/star.png">
						<img class="rating4" src="img/star.png">
						<img class="rating4" src="img/star.png">
						<img class="rating4" src="img/star.png">
					</c:when>
					<c:when test="${review.rating >3}">
						<img class="rating3" src="img/star.png">
						<img class="rating3" src="img/star.png">
						<img class="rating3" src="img/star.png">

					</c:when>
					<c:when test="${review.rating >2}">
						<img class="rating2" src="img/star.png">
						<img class="rating2" src="img/star.png">

					</c:when>
					<c:otherwise>
						<img class="rating1" src="img/star.png">
					</c:otherwise>
				</c:choose>
			</div>
			</p>
			<p>${review.text}</p>
		</div>
		<hr>
	</c:forEach>



	<c:url var="bookReviewPageUrl" value="/bookReviewPage" />
	<p>
		<a href="${bookReviewPageUrl}">Write your own review here:</a>
	</p>

</body>
</html>



