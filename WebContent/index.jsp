<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Worst Calculator</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

<header>
	<h1>Worst Calculator</h1>
</header>


<div class="middle">
	<form action="getCalculatorServlet" method="post">
		<p>
			<label>First Number:<br>
				<input type="text" name="userNumber1" size=10>
			</label>
		</p>
		<p class="operators">
			<input type="radio" name="operation1" value="plus" checked="checked"/>+
			<input type="radio" name="operation1" value="minus"/>-<br>
			<input type="radio" name="operation1" value="multiply"/>*
			<input type="radio" name="operation1" value="divide"/>/
		</p>
		<p>
			<label>Second Number:<br>
				<input type="text" name="userNumber2" size=10>
			</label>
		</p>
		<p class="operators">
			<input type="radio" name="operation2" value="plus" checked="checked"/>+
			<input type="radio" name="operation2" value="minus"/>-<br>
			<input type="radio" name="operation2" value="multiply"/>*
			<input type="radio" name="operation2" value="divide"/>/
		</p>
		<p>
			<label>Third Number:<br>
				<input type="text" name="userNumber3" size=10>
			</label>
		</p>
		<input type="submit" value="Calculate">
	</form>
</div>
</body>
</html>