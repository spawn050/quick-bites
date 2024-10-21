package com.omkar.service;

import java.util.List;

import com.omkar.model.Notification;
import com.omkar.model.Order;
import com.omkar.model.Restaurant;
import com.omkar.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
