package com.company.behavioral.strategy;

import com.company.behavioral.strategy.payment_strategy.PaymentStrategy;

import java.math.BigDecimal;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;
    private final PaymentStrategyFactory paymentStrategyFactory;

    public PaymentProcessor(PaymentStrategyFactory paymentStrategyFactory) {
        this.paymentStrategyFactory = paymentStrategyFactory;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public boolean processPayment(BigDecimal amount, Person person) {
        return paymentStrategy.processPayment(amount, person);
    }

    public PaymentStrategy getPaymentStrategy(PaymentType paymentType) {
        return paymentStrategyFactory.getByPaymentType(paymentType);
    }
}
