<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Favorite Things</title>
</head>
<body>
 <h2> Tell us about your favority things</h2>
 <c:url var="startSurveyUrl" value='/favsPage1'/>
 <a href="${startSurveyUrl}">Take our survey</a>
</body>
</html>