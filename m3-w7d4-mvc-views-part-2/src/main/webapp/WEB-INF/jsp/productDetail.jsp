<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp">
	<jsp:param name="ProductDetail View" value="title" />
	<jsp:param name="currentPage" value="productDetail" />

</jsp:include>

<div class="toy_image_detail">
	<img id="pic_detail" src="img/<c:out value="${product.imageName}"/>">
</div>

<div class="toy_info_detail">

<div class="toy_detail">
	<c:out value="${product.name}" />
</div>


<div class="best_seller_detail">
	<c:if test="${product.topSeller}">
		<c:out value="BEST SELLER!" />
	</c:if>
</div>


<div class="manufacturer_detail">
	<c:out value="by ${product.manufacturer}" />
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

<div class="price_detail">
	<c:out value="$${product.price}" />
</div>

<div class="weight_detail">
	<c:out value="${product.weightInLbs} lbs" />
</div>

<div class="description_detail">
	<c:out value="${product.description} lbs" />
</div>
</div>


<jsp:include page="footer.jsp" />