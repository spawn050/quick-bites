package com.omkar.service;

import java.util.List;

import com.stripe.exception.StripeException;
import com.omkar.Exception.CartException;
import com.omkar.Exception.OrderException;
import com.omkar.Exception.RestaurantException;
import com.omkar.Exception.UserException;
import com.omkar.model.Order;
import com.omkar.model.PaymentResponse;
import com.omkar.model.User;
import com.omkar.request.CreateOrderRequest;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
