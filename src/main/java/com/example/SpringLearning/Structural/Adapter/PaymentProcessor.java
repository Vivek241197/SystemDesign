package com.example.SpringLearning.Structural.Adapter;


public interface PaymentProcessor {
    void processPayment(double amount, String currency);
    boolean isPaymentSuccessful();
    String getTransactionId();
}



//Adapter Design pattern is a pattern that that allows incompatible
// interfaces to work together by converting the interface of one class
// into another that the client expects.

// It is used when we want to bridge the gap between new and old code,
// or between systems built with different interface designs.