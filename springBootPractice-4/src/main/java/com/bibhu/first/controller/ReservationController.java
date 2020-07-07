package com.bibhu.first.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bibhu.first.dto.ReservationRequest;
import com.bibhu.first.entities.Flight;
import com.bibhu.first.entities.Reservation;
import com.bibhu.first.repository.FlightRepository;
import com.bibhu.first.service.ReservationService;

@Controller
public class ReservationController {
	@Autowired	
	FlightRepository flightRepositore;
	
	@Autowired
	ReservationService reservationService;
	private static final Logger logger=LoggerFactory.getLogger(ReservationController.class);
	@GetMapping("/showCompleteReservation")
	public String showCompleteResrvation(@RequestParam("flightId")long id,ModelMap model) {
		logger.info("inside show CompleteReservaiton of ReservaitnController method "+id);
		Flight flight=flightRepositore.getOne(id);
		model.addAttribute("flight",flight);
		return "flight/completeRegistration";
	}
	@PostMapping("/completeReservation")
	public String completeReservation(ReservationRequest request,ModelMap model) {
		logger.info("completeReservation method of ReservationService "+request);
		Reservation reservation=reservationService.bookFlight(request);
		model.addAttribute("msg", "Reservation created successfully and it is"+reservation.getId());
		return "flight/reservationConformation";
	}
}
