<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Your favorite Season</title>
</head>
<body>
	<h1>Favorite Things Exercise</h1>
	<Strong> Your favorite color:</Strong>
	<c:out value="${favoriteThings.color}" /><br>
	<Strong> Your favorite color:</Strong>
	<c:out value="${favoriteThings.food}" /><br>
	<Strong> Your favorite color:</Strong>
	<c:out value="${favoriteThings.season}" /><br>
</body>
</html>