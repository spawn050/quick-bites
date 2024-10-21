package com.omkar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omkar.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
