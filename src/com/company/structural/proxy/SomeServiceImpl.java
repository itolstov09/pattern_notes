package com.company.structural.proxy;

public class SomeServiceImpl implements SomeService {
    @Override
    public void process() {
        System.out.println("SomeServiceImpl processing");
    }

    @Override
    public String getSomeString() {
        return "SomeServiceImpl";
    }
}
