<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Success</title>
</head>
<body>
<div>
    <c:forEach items="${message}" var="msg">
        <div>${msg}</div>
    </c:forEach>
</div>
<div>
    <a href="${pageContext.request.contextPath}/home">Return to home</a>
</div>
</body>
</html>
