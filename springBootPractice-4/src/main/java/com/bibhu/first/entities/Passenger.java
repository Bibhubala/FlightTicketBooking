package com.bibhu.first.entities;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Passenger extends AbstractEntity {
private String firstName;
private String lastName;
private String middleName;
private String email;
private String phone;
}
