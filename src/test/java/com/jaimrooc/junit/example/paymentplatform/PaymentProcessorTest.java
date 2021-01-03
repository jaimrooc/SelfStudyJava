package com.jaimrooc.junit.example.paymentplatform;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static com.jaimrooc.junit.example.paymentplatform.PaymentResponse.PaymentStatus.ERROR;
import static com.jaimrooc.junit.example.paymentplatform.PaymentResponse.PaymentStatus.OK;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PaymentProcessorTest {

    @InjectMocks
    PaymentProcessor paymentProcessor;

    @Mock
    PaymentGateway paymentGateway;

    @Before
    public void setUp() {
        paymentProcessor = new PaymentProcessor(paymentGateway);
    }

    @Test
    public void makePayment_whenPaymentIsCorrect() {
        when(paymentGateway.requestPayment(any())).thenReturn(new PaymentResponse(OK));

        assertTrue(paymentProcessor.makePayment(1000));
    }

    @Test
    public void makePayment_whenPaymentIsWrong() {
        when(paymentGateway.requestPayment(any())).thenReturn(new PaymentResponse(ERROR));

        assertFalse(paymentProcessor.makePayment(1000));
    }
}