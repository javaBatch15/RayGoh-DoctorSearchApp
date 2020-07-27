<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Form</title>
    <style type="text/css">
        .tg {
            border-collapse: collapse;
            border-spacing: 0;
            border-color: #ccc;
        }

        .tg td {
            font-family: Arial, sans-serif;
            font-size: 14px;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #fff;
        }

        .tg th {
            font-family: Arial, sans-serif;
            font-size: 14px;
            font-weight: normal;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #f0f0f0;
        }

        .tg
    </style>
</head>
<body>
<h2>Enter search filters</h2>
<form action="/home/getDoctor" method="post"><br>
    FirstName : <input type="text" name="firstname"/><br>
    LastName : <input type="text" name="lastname"/><br>
    Street : <input type="text" name="street"/><br>
    City : <input type="text" name="city"/><br>
    State : <input type="text" name="state"/><br>
    Zip Code : <input type="number" name="zipcode"/><br>
    Rating (Greater or equals) : <input type="number" name="rating"/><br>
    <input type="submit" value="Find Doctor"/>
</form>
<div>
    <h2>Search by filtering</h2>
</div>
<table class="tg">
    <tr>
        <td>ID</td>
        <td>First name</td>
        <td>Last name</td>
        <td>City</td>
        <td>State</td>
        <td>Zip code</td>
        <td>Street</td>
        <td>Rating</td>
    </tr>
    <c:if test = "${doctorList.size()>0}">
        <c:forEach items="${doctorList}" var="doctor">
            <tr>
                <td>${doctor.id}</td>
                <td>${doctor.firstname}</td>
                <td>${doctor.lastname}</td>
                <td>${doctor.city}</td>
                <td>${doctor.state}</td>
                <td>${doctor.zipcode}</td>
                <td>${doctor.street}</td>
                <td>${doctor.rating}</td>
            </tr>
        </c:forEach>
    </c:if>
</table>
</body>
</html>
