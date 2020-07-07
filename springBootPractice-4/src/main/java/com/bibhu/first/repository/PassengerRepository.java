package com.bibhu.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bibhu.first.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
