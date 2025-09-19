<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="LoginController" method="post">
		<table align="center">
			<tr><td align="center"><b><h3>Login Form</h3></b></td></tr>
			<tr><td>Email</td><td> <input type="email" name="email"> </td></tr>
			<tr><td>Password</td><td> <input type="password" name="pass"> </td></tr>
			<tr><td>Submit</td><td> <input type="submit" name="submit"> </td></tr>
			<tr><td>Reset</td><td> <input type="reset" name="reset"> </td></tr>
		</table>
	</form>
</body>
</html>