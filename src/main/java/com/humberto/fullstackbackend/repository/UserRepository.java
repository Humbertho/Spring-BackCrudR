package com.humberto.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.humberto.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long>
{
	
}
