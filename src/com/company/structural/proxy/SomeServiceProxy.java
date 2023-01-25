package com.company.structural.proxy;

public class SomeServiceProxy implements SomeService {
    private static SomeService object;

    @Override
    public void process() {
        object = getObject();
        System.out.println("Proxy log before object.process()");
        object.process();
        System.out.println("Proxy log after object.process()");
    }

    /*
    Пример ниже, это то, как делать НЕЛЬЗЯ.
    Прокси нужен для служебной, а не для БИЗНЕС логики
    Служебная логика - логгирование, проверка доступа, кеширование
     */
    @Override
    public String getSomeString() {
        object = getObject();
        return "proxy " + object.getSomeString();
    }

    private SomeService getObject() {
        return object == null ? new SomeServiceImpl() : object;
    }
}
