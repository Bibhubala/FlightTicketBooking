package com.bibhu.first.controller;

import java.sql.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bibhu.first.entities.Flight;
import com.bibhu.first.repository.FlightRepository;

@Controller
public class FlightController {
	@Autowired
	FlightRepository flightRepository;
	private static final Logger logger = LoggerFactory.getLogger(FlightController.class);

	@PostMapping("/findFlights")
	public String findFlight(@RequestParam("from") String from, @RequestParam("to") String to,
			@RequestParam("dateOfDeparture") Date departureDate, ModelMap model) {
		// System.out.println("Flight find it");
		// Enter date in yyyy-mm-dd format
		logger.info("find Flight of FlightController from " + from + " to " + to);
		List<Flight> flights = flightRepository.findFlights(from, to, departureDate);
		model.addAttribute("flights", flights);
		return "flight/displayFlights";
	}

}
