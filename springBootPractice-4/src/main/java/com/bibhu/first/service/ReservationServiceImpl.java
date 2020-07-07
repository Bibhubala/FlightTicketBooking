package com.bibhu.first.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bibhu.first.dto.ReservationRequest;
import com.bibhu.first.entities.Flight;
import com.bibhu.first.entities.Passenger;
import com.bibhu.first.entities.Reservation;
import com.bibhu.first.repository.FlightRepository;
import com.bibhu.first.repository.PassengerRepository;
import com.bibhu.first.repository.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {
	@Autowired
	FlightRepository flightRepository;
	@Autowired
	PassengerRepository passengerRepository;
	@Autowired
	ReservationRepository reservationRepoitory;

	@Override
	public Reservation bookFlight(ReservationRequest request) {
		Long flightId = request.getFlightId();
		Flight flight = flightRepository.getOne(flightId);

		Passenger passenger = new Passenger();

		passenger.setFirstName(request.getPassengerFirstName());
		passenger.setLastName(request.getPassengerLastName());
		passenger.setEmail(request.getPassengerEmail());
		passenger.setPhone(request.getPassengerPhone());

		Passenger savedPassenger = passengerRepository.save(passenger);
		Reservation reservation = new Reservation();
		reservation.setPassenger(savedPassenger);
		reservation.setFlight(flight);
		reservation.setCheckedIn(0);
		Reservation savedReservation = reservationRepoitory.save(reservation);

		return savedReservation;
	}

}
