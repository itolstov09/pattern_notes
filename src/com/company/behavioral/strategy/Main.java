package com.company.behavioral.strategy;

import com.company.behavioral.strategy.payment_strategy.PaymentStrategy;
import com.company.behavioral.strategy.payment_strategy.PaymentStrategyPayPal;

import java.math.BigDecimal;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Person biba = new Person("Biba", PaymentType.PAYPAL);

        PaymentStrategyFactory paymentStrategyFactory = new PaymentStrategyFactory();

        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentStrategyFactory);

        PaymentStrategy paymentStrategy = paymentProcessor.getPaymentStrategy(biba.getPaymentType());

        paymentProcessor.setPaymentStrategy(paymentStrategy);

        int paymentCount = 3;
        for (int i = 1; i < paymentCount + 1; i++) {
            boolean isPaymentSuccessful = paymentProcessor.processPayment(BigDecimal.valueOf(250L), biba);
            System.out.printf("№: %d, name: %s, successful?: %s%n", i, biba.getName(), isPaymentSuccessful);
        }

        Map<String, BigDecimal> stubDB = PaymentStrategyPayPal.getStubDB();

        Person boba = new Person("Boba", PaymentType.PAYPAL);
        paymentStrategy = paymentProcessor.getPaymentStrategy(boba.getPaymentType());
        paymentProcessor.setPaymentStrategy(paymentStrategy);
        paymentCount = 20;
        for (int i = 1; i < paymentCount + 1; i++) {
            boolean isPaymentSuccessful = paymentProcessor.processPayment(BigDecimal.valueOf(250L), boba);
            System.out.printf("№: %d, name: %s, successful?: %s%n", i, boba.getName(), isPaymentSuccessful);
        }

        System.out.println("bp");

    }
}
