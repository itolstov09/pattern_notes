package com.company.behavioral.strategy.payment_strategy;

import com.company.behavioral.strategy.Person;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class PaymentStrategyPayPal implements PaymentStrategy {

    private final static Map<String, BigDecimal> stubDB = new HashMap<>();

    static {
        stubDB.put("Biba", new BigDecimal("500"));
        stubDB.put("Boba", new BigDecimal("4503"));
    }

    public static Map<String, BigDecimal> getStubDB() {
        return stubDB;
    }

    @Override
    public boolean processPayment(BigDecimal amount, Person person) {
        return processPayPalTransaction(person.getName(), amount);
    }

    private boolean processPayPalTransaction(String name, BigDecimal amount) {
        BigDecimal payPalBalance = stubDB.get(name);
        if (payPalBalance == null || payPalBalance.compareTo(amount) < 0) {
            return false;
        }

        stubDB.put(name, payPalBalance.subtract(amount));
        return true;
    }
}
