<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Information filling page</title>
</head>
<body>
	<form action="doSubmit" method="post">
	<fieldset> Email form
		Enter Email: <input type="email" name="email"><br>
		<input type="radio" id="female" name="gender" value="1">
		<label for="female">Female</label><br>
		
		<input type="radio" id="male" name="gender" value="2">
		<label for="male">Male</label><br>
		<input type="submit" value="submit">
		</fieldset>
	</form>
</body>
</html>