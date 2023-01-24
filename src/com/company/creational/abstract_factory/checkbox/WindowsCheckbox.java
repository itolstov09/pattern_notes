package com.company.creational.abstract_factory.checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Windows checkbox");
    }
}
