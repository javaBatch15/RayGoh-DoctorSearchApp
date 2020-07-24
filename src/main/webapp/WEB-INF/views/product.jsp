<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="product/add" method="post" enctype="multipart/form-data"><br>
Name : <input type="name" name="name"/><br>
Details : <input type="text" name="details"/><br>
Price : <input type="number" name="price"/><br>
Images : <input type="file" name="files" multiple="multiple"/><br>
<input type="submit"/>
</form>
<form action="product">
    <input type="submit" value="Reset" />
</form>
<div>
    ${message}
</div>
</body>
</html>
