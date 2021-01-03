package com.jaimrooc.junit.example.paymentplatform;


import static com.jaimrooc.junit.example.paymentplatform.PaymentResponse.PaymentStatus.OK;

public class PaymentProcessor {

    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean makePayment(double amount) {
        PaymentResponse response = paymentGateway.requestPayment(new PaymentRequest(amount));
        return response.getStatus() == OK;
    }
}
