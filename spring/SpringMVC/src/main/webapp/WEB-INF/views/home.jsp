<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page session="false" %>
<html>
<head>
<title>Spittr</title>
</head>
<body>
<h1>Welcome to Spittr</h1>
<a href="<c:url value="/spittles"/>">Spittles</a> |
<a href="<c:url value="/spitter/register"/>">Register</a>
</body>
</html>