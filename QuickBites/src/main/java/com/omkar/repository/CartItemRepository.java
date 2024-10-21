package com.omkar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omkar.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
