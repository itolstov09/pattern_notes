package com.company.creational.abstract_factory.button;

public class MacOsButton implements Button{
    @Override
    public void paint() {
        System.out.println("Mac button");
    }
}
