<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Choose Time Slot</title>
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
    </style>
</head>
<body>
<h2>Availability for doctor ${firstname}  ${lastname}</h2>
<div>
    List of available appointment times for: ${appt.apptDate}
</div>
<table class="tg">
    <tr>
        <td>08:00am - 10:00am</td>
        <td>10:00am - 12:00pm</td>
        <td>12:00pm - 02:00pm</td>
        <td>02:00pm - 04:00pm</td>
        <td>06:00pm - 08:00pm</td>
    </tr>
    <tr>
        <td>
            <c:choose>
                <c:when test="${appt.eightToTen!=null}">
                    Not available
                </c:when>
                <c:otherwise>
                    <a href="${pageContext.request.contextPath}/appointments/confirm?apptID=${appt.appointmentID}&timeSlot=1">Select</a>
                </c:otherwise>
            </c:choose>
        </td>
        <td>
            <c:choose>
                <c:when test="${appt.tenToTwelve!=null}">
                    Not available
                </c:when>
                <c:otherwise>
                    <a href="${pageContext.request.contextPath}/appointments/confirm?apptID=${appt.appointmentID}&timeSlot=2s">Select</a>
                </c:otherwise>
            </c:choose>
        </td>
        <td>
            <c:choose>
                <c:when test="${appt.twelveToTwo!=null}">
                    Not available
                </c:when>
                <c:otherwise>
                    <a href="${pageContext.request.contextPath}/appointments/confirm?apptID=${appt.appointmentID}&timeSlot=3">Select</a>
                </c:otherwise>
            </c:choose>
        </td>
        <td>
            <c:choose>
                <c:when test="${appt.twoToFour!=null}">
                    Not available
                </c:when>
                <c:otherwise>
                    <a href="${pageContext.request.contextPath}/appointments/confirm?apptID=${appt.appointmentID}&timeSlot=4">Select</a>
                </c:otherwise>
            </c:choose>
        </td>
        <td>
            <c:choose>
                <c:when test="${appt.fourToSix!=null}">
                    Not available
                </c:when>
                <c:otherwise>
                    <a href="${pageContext.request.contextPath}/appointments/confirm?apptID=${appt.appointmentID}&timeSlot=5">Select</a>
                </c:otherwise>
            </c:choose>
        </td>
    </tr>
</table>
</body>
</html>
