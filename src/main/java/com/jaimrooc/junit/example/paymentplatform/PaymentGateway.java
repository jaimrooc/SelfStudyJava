package com.jaimrooc.junit.example.paymentplatform;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);

}
