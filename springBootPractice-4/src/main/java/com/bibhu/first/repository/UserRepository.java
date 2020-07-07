package com.bibhu.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bibhu.first.entities.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
//public Users findByEmail(String email);
public Users findByEmail(String email);
}
