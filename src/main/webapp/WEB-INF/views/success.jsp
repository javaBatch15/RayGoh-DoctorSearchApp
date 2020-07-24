<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
</head>
<body>
Success fully processed product:
${product.name}<br>
  Details:
${product.details}<br>
<div>
  File uploaded:
  <a href="${fileName}">${fileName}</a>
</div>
</body>
</html>
