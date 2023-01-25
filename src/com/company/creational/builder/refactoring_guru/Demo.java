package com.company.creational.builder.refactoring_guru;

import com.company.creational.builder.refactoring_guru.builder.CarBuilderImpl;
import com.company.creational.builder.refactoring_guru.builder.CarManualBuilder;
import com.company.creational.builder.refactoring_guru.car.Car;
import com.company.creational.builder.refactoring_guru.car.Manual;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        // Директор получает объект конкретного строителя от клиента
        // (приложения). Приложение само знает какой строитель использовать,
        // чтобы получить нужный продукт.
        CarBuilderImpl builder = new CarBuilderImpl();

        director.constructSportsCar(builder);

        // Готовый продукт возвращает строитель, так как Директор чаще всего не
        // знает и не зависит от конкретных классов строителей и продуктов.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Директор может знать больше одного рецепта строительства.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
