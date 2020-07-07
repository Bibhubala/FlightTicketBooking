package com.bibhu.first.entities;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;

import lombok.Data;
@Data
@Entity
public class Flight extends AbstractEntity {
private String flightNumber;
private String operatingAirline;
private String departureCity;
private String arrivalCity;
private Date dateOfDeparture;
private Timestamp estimatedDepartureTime;

}
