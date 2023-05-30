package com.company.behavioral.strategy.payment_strategy;

import com.company.behavioral.strategy.Person;

import java.math.BigDecimal;

public interface PaymentStrategy {

    boolean processPayment(BigDecimal amount, Person person);

}
