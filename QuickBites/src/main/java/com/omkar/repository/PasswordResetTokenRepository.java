package com.omkar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omkar.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
