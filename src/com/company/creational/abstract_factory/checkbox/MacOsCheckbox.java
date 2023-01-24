package com.company.creational.abstract_factory.checkbox;

public class MacOsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Mac OS checkbox");
    }
}
