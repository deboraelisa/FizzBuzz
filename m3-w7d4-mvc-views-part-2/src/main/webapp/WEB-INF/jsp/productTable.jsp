<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="header.jsp">
	<jsp:param name="title" value="ProductTable View" />
	<jsp:param name="currentPage" value="productTable" />

</jsp:include>

<div id="top_title_table">
	<c:out value="Toy Department" />
</div>

<table>
	<tr>
		<th class="th"></th>

		<c:forEach var="product" items="${productList}">

			<c:url var="detailUrl" value="/detailView">
				<c:param name="productId" value="${product.productId}" />
			</c:url>
			<td class="row_image"><a href="${detailUrl}"><img width="80"
					src="img/<c:out value="${product.imageName}"/>"></a></td>

		</c:forEach>
	</tr>

	<tr>
		<th class="th"></th>

		<c:forEach var="product" items="${productList}">
			<td id="best_seller_row"><c:if test="${product.topSeller}">
					<c:out value="BEST SELLER!" />
				</c:if></td>
		</c:forEach>
	</tr>

	<tr>
		<th class="th" id="name">Name</th>

		<c:forEach var="product" items="${productList}">
			<td id="name_row"><c:out value="${product.name}" /></td>
		</c:forEach>
	</tr>



	<tr class="ratingRow">
		<th class="th" id="ratingTable">Rating</th>
		<c:forEach var="product" items="${productList}">
			<td><c:choose>
					<c:when test="${product.averageRating == 5}">
						<img class="ratingRow" src="img/5-star.png">
					</c:when>
					<c:when test="${product.averageRating >4}">
						<img class="ratingRow" src="img/4-star.png">
					</c:when>
					<c:when test="${product.averageRating >3}">
						<img class="ratingRow" src="img/3-star.png">
					</c:when>
					<c:when test="${product.averageRating >2}">
						<img class="ratingRow" src="img/2-star.png">
					</c:when>
					<c:otherwise>
						<img class="ratingRow" src="img/1-star.png">
					</c:otherwise>
				</c:choose></td>
		</c:forEach>
	</tr>

	<tr>
		<th class="th" id="manufacturer">Mfr</th>

		<c:forEach var="product" items="${productList}">
			<td id="manufacturer_row"><c:out value="${product.manufacturer}" /></td>
		</c:forEach>
	</tr>

	<tr>
		<th class="th" id="price">Price</th>

		<c:forEach var="product" items="${productList}">
			<td id="price_row"><c:out value="$${product.price}" /></td>
		</c:forEach>
	</tr>

	<tr>
		<th class="th" id="weight">wt. (in lbs)</th>

		<c:forEach var="product" items="${productList}">
			<td id="weight_row"><c:out value="${product.weightInLbs}" /></td>
		</c:forEach>
	</tr>

</table>



<jsp:include page="footer.jsp" />







