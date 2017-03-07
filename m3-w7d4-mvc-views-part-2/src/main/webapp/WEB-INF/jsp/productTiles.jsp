<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="header.jsp">
	<jsp:param name="title" value="ProductTiles View" />
	<jsp:param name="currentPage" value="productTiles" />

</jsp:include>


<div id="top_title_tile">
	<c:out value="Toy Department" />
</div>

<div id="container" class="columns">
	<c:forEach var="product" items="${productList}">
		<div class="box">
			<c:url var="detailUrl" value="/productDetail">
				<c:param name="productId" value="${product.productId}" />
			</c:url>
			<a href="${detailUrl}"><img class="tiles_image"
				src="img/<c:out value="${product.imageName}"/>"></a>


			<div class="tiles_best_seller">
				<c:out value="${product.name}" />

				<font color="red"> <c:if test="${product.topSeller}">
						<c:out value="BEST SELLER!" />
					</c:if>
				</font>
			</div>
			<div class="tiles_manufacturer">
				<c:out value="by ${product.manufacturer}" />
			</div>
			<div class="tiles_price">
				<c:out value="$${product.price}" />
			</div>
			<div class="tiles_weight">
				<b> <c:out value="Weight" />
				</b>
				<c:out value="${product.weightInLbs}lbs" />
			</div>
			<div class="tiles_rating">
				<c:choose>
					<c:when test="${product.averageRating == 5}">
						<img class="rating" src="img/5-star.png">
					</c:when>
					<c:when test="${product.averageRating >4}">
						<img class="rating" src="img/4-star.png">
					</c:when>
					<c:when test="${product.averageRating >3}">
						<img class="rating" src="img/3-star.png">
					</c:when>
					<c:when test="${product.averageRating >2}">
						<img class="rating" src="img/2-star.png">
					</c:when>
					<c:otherwise>
						<img class="rating" src="img/1-star.png">
					</c:otherwise>
				</c:choose>
				<br>
			</div>
		</div>
	</c:forEach>
</div>






<jsp:include page="footer.jsp" />