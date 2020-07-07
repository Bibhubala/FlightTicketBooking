package com.bibhu.first.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bibhu.first.dto.ReservationUpdateRequest;
import com.bibhu.first.entities.Reservation;
import com.bibhu.first.entities.Users;
import com.bibhu.first.repository.ReservationRepository;
import com.bibhu.first.repository.UserRepository;

@RestController
public class ReservationRestController {
	@Autowired
	ReservationRepository reservationRepository;
	@Autowired
	UserRepository userRepository;
public static final Logger logger=LoggerFactory.getLogger(ReservationRestController.class);
	@GetMapping("/reservations/{id}")
	public  Optional<Reservation> findReservation(@PathVariable("id") Long id) {
		//System.out.println("rest url method" +id);
		logger.info("find Reservation "+id);
		return reservationRepository.findById(id);

	}
	@GetMapping("/getUser/{id}")
	public  Optional<Users> getUser(@PathVariable("id") Long  id) {
		//System.out.println("Id is :" + id);
		logger.info("get user if ReservationRestController id is: "+id);
		return userRepository.findById(id);
	}

	@PostMapping("/reservations/update")
	public Reservation updateReservaiton(@RequestBody ReservationUpdateRequest request) {
		logger.info("inside updateReservation method of ReestController object is: "+request);
		Reservation reservation = reservationRepository.getOne(request.getId());
		reservation.setNumberOfBags(request.getNumberOfBags());
		reservation.setCheckedIn(request.getCheckedIn());
		return reservationRepository.save(reservation);

	}

}
