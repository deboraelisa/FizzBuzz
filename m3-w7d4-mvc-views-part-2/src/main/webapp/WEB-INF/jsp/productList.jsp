<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="header.jsp">
	<jsp:param name="title" value="ProductList View" />
	<jsp:param name="currentPage" value="productList" />

</jsp:include>


<div class="topTitle">
	<c:out value="Toy Department" />
</div>


<c:forEach var="product" items="${productList}">
	<div class="toy_image_descrition">
		<c:url var="detailUrl" value="/detailView">
			<c:param name="productId" value="${product.productId}" />
		</c:url>

		<div class="toy_image_list">
			<a href="${detailtUrl}"><img
				src="img/<c:out value="${product.imageName}"/>"></a>
		</div>

		<div class="toy_description">

			<c:out value="${product.name}" />
			<div>
				<div>
					<c:if test="${product.topSeller}">
						<c:out value="BEST SELLER!" />
					</c:if>

				</div>
				<c:out value="by ${product.manufacturer}" />
			</div>
			<div>
				<c:out value="$${product.price}" />
			</div>
			<div>
				<c:out value="${product.weightInLbs} lbs" />
			</div>
			<div class="rating_div">
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
			</div>
		</div>
	</div>
	<hr>

</c:forEach>






<jsp:include page="footer.jsp" />