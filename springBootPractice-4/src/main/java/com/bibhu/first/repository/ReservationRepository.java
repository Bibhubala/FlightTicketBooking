package com.bibhu.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bibhu.first.entities.Passenger;
import com.bibhu.first.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {



	
}
