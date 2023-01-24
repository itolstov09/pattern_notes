package com.company.creational.abstract_factory.button;

public class WIndowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows button");
    }
}
