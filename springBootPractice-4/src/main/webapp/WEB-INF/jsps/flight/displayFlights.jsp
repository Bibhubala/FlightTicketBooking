<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Flights</h2>
	<table>
		<tr>
			<th>Airline</th>
			<th>Departure City</th>
			<th>Arrival City</th>
			<th></th>
		</tr>
		<c:forEach items="${flights}" var="flight">
		<tr>
		<td>${flight.operatingAirline}</td>
		<td>${flight.departureCity}</td>
		<td>${flight.arrivalCity}</td>
		<td><a href="showCompleteReservation?flightId=${flight.id}">select</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>