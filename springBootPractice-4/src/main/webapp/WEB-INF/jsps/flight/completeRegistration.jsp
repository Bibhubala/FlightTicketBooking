<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complete Reservation</title>
</head>
<body>
	<h2>Complete reservation</h2>
	Airline:${flight.operatingAirline}
	<br> Departure City:${flight.departureCity}
	<br> Arrival City:${flight.arrivalCity}
	<br>

	<form action="completeReservation" method="post">
		<pre>
		<h2>Passenger Detail</h2>
		first name:<input type="text" name="passengerFirstName">
		last name:<input type="text" name="passengerLastName">
		email: <input type="text" name="passengerEmail">
		phone: <input type="text" name="passengerPhone">

		<h2>Card Details</h2>
		<br> Name on the card:<input type="text" name="nameOnTheCard">
		Card no:<input type="text" name="cardNumber"> 
		Expiry date:<input type="text" name="expireDate">
		Three digit sec code:<input type="text" name="securityCode">
		<input type="hidden" name="flightId" value="${flight.id}"> <input
				type="submit" value="Enter">
			</pre>
	</form>
</body>
</html>