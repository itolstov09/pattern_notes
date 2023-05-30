package com.company.behavioral.strategy;

public class Person {
    private String name;
    private PaymentType paymentType;

    public Person(String name, PaymentType paymentType) {
        this.name = name;
        this.paymentType = paymentType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
}
