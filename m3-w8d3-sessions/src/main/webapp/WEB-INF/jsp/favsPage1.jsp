<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Favorite Color</title>
</head>
<body>
	<h1>Favorite Things Exercise</h1>
	<h3>What is your favorite color?</h3>
	
	<c:url var="formAction" value="/favsPage1"/>
	<form action="${formAction}" method="POST">
	<input type="text" name="favColor" id="favColor">
	<input type="submit" value="Next >>"> 
	</form>
</body>
</html>