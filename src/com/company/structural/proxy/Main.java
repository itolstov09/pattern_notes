package com.company.structural.proxy;

public class Main {
    public static void main(String[] args) {
        SomeService service = new SomeServiceProxy();
        service.process();

        String someString = service.getSomeString();
        System.out.println(someString);

    }
}
