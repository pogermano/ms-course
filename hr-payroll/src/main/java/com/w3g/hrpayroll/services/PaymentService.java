package com.w3g.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.w3g.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long eorkerId, int  days) {
		return new Payment("Tuca", 5000.00, days);
	}
}
