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
<h2>Add doctor</h2>
<form action="/home/addDoctor" method="post"><br>
    FirstName : <input type="text" name="firstname"/><br>
    LastName : <input type="text" name="lastname"/><br>
    Street : <input type="text" name="street"/><br>
    City : <input type="text" name="city"/><br>
    State : <input type="text" name="state"/><br>
    Zip Code : <input type="number" name="zipcode"/><br>
    Rating : <input type="number" name="rating"/><br>
    Specialty : <input type="text" name="specialty"/><br>
    <input type="submit" value="Add Doctor"/>
</form>
<div>
    <c:forEach items="${message}" var="msg">
        <div>${msg}</div>
    </c:forEach>
</div>
<div>
    <h2>Doctor List</h2>
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
        <td></td>
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
            <td>
                <form action="/appointments" method="post">
                    <input type="hidden" name="doc" value="${doctor.id}">
                    <input type="hidden" name="firstname" value="${doctor.firstname}">
                    <input type="hidden" name="lastname" value="${doctor.lastname}">
                    <input type="submit" value="Book Appointment">
                </form>
            </td>
        </tr>
    </c:forEach>
    </c:if>
</table>
</body>
</html>
