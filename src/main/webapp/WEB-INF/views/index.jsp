
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>URL Shortner</title>
</head>
<body>

<h1>This is a URL Shortner service</h1>


		
		<form:form action="show" method="GET">
                Long Url : <input type="text" name="longUrl" />
                <input type="submit" value="Search" />
            </form:form>
	
<h2>${link}</h2>

</body>
</html>