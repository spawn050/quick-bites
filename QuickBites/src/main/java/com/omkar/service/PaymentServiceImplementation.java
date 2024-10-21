package com.omkar.service;

import com.omkar.model.Order;
import com.omkar.model.PaymentResponse;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImplementation implements PaymentService{

	@Override
	public PaymentResponse generatePaymentLink(Order order) {
		PaymentResponse res = new PaymentResponse();
		res.setPayment_url("http://localhost:3000/payment/success/"+order.getId());
		return res;
	}

}
