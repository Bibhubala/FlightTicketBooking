package com.bibhu.first.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Reservation extends AbstractEntity {
private int checkedIn;
private int numberOfBags;
@OneToOne
private Passenger passenger;
@OneToOne
private Flight flight;
private Timestamp created;
}
