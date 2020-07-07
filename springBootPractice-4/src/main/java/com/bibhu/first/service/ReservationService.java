package com.bibhu.first.service;

import com.bibhu.first.dto.ReservationRequest;
import com.bibhu.first.entities.Reservation;

public interface ReservationService {
public Reservation bookFlight(ReservationRequest request);
}
