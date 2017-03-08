<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Favorite Season</title>
</head>
<body>
	<h1>Favorite Things Exercise</h1>
	<h3>What is your favorite season?</h3>

	<c:url var="formAction" value="/favsPage3" />
	<form action="${formAction}" method="POST">
		<input type="radio" name="favSeason" value="Spring">Spring<br>
		<input type="radio" name="favSeason" value="Summer">Summer<br>
		<input type="radio" name="favSeason" value="Fall">Fall<br>
		<input type="radio" name="favSeason" value="Winter">Winter<br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>