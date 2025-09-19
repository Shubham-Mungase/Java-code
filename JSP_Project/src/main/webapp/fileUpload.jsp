<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="FileUpload" method="POST" enctype="multipart/form-data">
<table align="center">
<tr><td>ID</td><td><input type="text" name="id"></td></tr>
<tr><td>Name</td><td><input type="text" name="name"></td></tr>
<tr><td>Upload image</td><td><input type="file" name="image" placeholder="Browse"></td></tr>
<tr><td>Submit</td><td><input type="Submit" name="but" value="Upload"></td></tr>
<tr><td>Show</td><td><input type="Submit" name="but" value="Show"></td></tr>
</table>

</form>
</body>
</html>