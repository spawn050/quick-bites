package com.omkar.service;

import com.stripe.exception.StripeException;
import com.omkar.model.Order;
import com.omkar.model.PaymentResponse;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}
