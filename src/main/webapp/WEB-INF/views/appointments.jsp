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
<h2>Availability for doctor ${firstname}  ${lastname}</h2>
<div>
    Please select a date
</div>
<%@ page import="java.time.LocalDate" %>
<%
    LocalDate localDate = LocalDate.now();
    int count = 1;
%>

<form action="/appointments/book" method="post"><br>
    <input type="hidden" name="doctorID" value="${doctorID}">
    <input type="hidden" name="firstname" value="${firstname}">
    <input type="hidden" name="lastname" value="${lastname}">

    <input type="radio" id="date1" name="apptDate" value="<%= localDate%>">
    <label for="date1"><%= localDate%></label>
    <%while (count <=20) { %>
    <input type="radio" id="date1" name="apptDate" value="<%= localDate.plusDays(count)%>">
    <label for="date1"><%= localDate.plusDays(count)%></label>
    <% if(count%5==0) {%>
    <br>
    <% }%>
    <% count++;%>
    <%}%>

    <input type="submit" value="Confirm Date"/>
</form>
</body>
</html>
