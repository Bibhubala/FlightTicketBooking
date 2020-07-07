package com.bibhu.first.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bibhu.first.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {
	@Query("from Flight where departureCity=:departureCity and arrivalCity=:arrivalCity and dateOfDeparture=:dateOfDeparture")
	List<Flight> findFlights(@Param("departureCity")String from,@Param("arrivalCity")String to,@Param("dateOfDeparture")Date daparturDate);

}