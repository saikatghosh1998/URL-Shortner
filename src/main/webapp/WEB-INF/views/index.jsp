
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>URL Shortner</title>
<link href="https://fonts.googleapis.com/css?family=Poppins" rel="stylesheet" />
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>



	<div class="s130">
	<form:form action="show" method="GET" onsubmit=" return continueornot();">
		<div class="inner-form">
			<div class="input-field first-wrap">
			<div class="svg-wrapper">
              
            </div>
				<input id="search" type="text" name="longUrl" placeholder="Paste your Link here!" />
			</div>
			<div class="input-field second-wrap">
				<input class="btn-search" type="submit" value="Search" />
			</div>
		</div>
		 <span id="error"></span>
		<h2>${link}</h2>
	</form:form>
	

</div>

<script>
function validateEmail(email) { 
    var re = /(ftp|http|https):\/\/(\w+:{0,1}\w*@)?(\S+)(:[0-9]+)?(\/|\/([\w#!:.?+=&%@!\-\/]))?/;
    return re.test(email);
 } 
function continueornot() {
    if(validateEmail(document.getElementById('search').value)){
    // ok
    }else{  alert("email not valid");
    return false;}
 }
</script>

</body>
</html>