<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Worst Calculator Result</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<header>
	<h1>Result</h1>
</header>

<div class="middle">
	<p class="result">
		${userCalculator.getNumber1()} ${userCalculator.getOperation1()} ${userCalculator.getNumber2()} 
		${userCalculator.getOperation2()} ${userCalculator.getNumber3()} equals ${userCalculator.getSolution()}
	</p>
	<a href="index.jsp">Continue Using this awful Calculator</a>
</div>


</body>
</html>