package com.bibhu.first.dto;

import lombok.Data;

@Data
public class ReservationRequest {
private Long flightId;
private String passengerFirstName;
private String passengerLastName;
private String passengerEmail;
private String passengerPhone;
private String nameOnTheCard;
private String expireDate;
private String securityCode;

}
