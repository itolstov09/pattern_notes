package com.company.behavioral.strategy.payment_strategy;

import com.company.behavioral.strategy.Person;

import java.math.BigDecimal;

public class PaymentStrategyCreditCard implements PaymentStrategy {

    @Override
    public boolean processPayment(BigDecimal amount, Person person) {
        System.out.println("Credit card strategy is not implemented");
        return false;
    }
}
