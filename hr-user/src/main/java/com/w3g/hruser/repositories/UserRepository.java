package com.w3g.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.w3g.hruser.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {
	
	User findByEmail(String email);

}
