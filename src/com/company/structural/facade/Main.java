package com.company.structural.facade;

import com.company.structural.facade.car_parts.AirController;
import com.company.structural.facade.car_parts.CoolingController;
import com.company.structural.facade.car_parts.FuelPump;
import com.company.structural.facade.car_parts.Starter;

public class Main {
    public static void main(String[] args) {
        CarEngineFacade facade = new CarEngineFacade(
                new AirController(),
                new CoolingController(),
                new FuelPump(),
                new Starter()
        );

        facade.startEngine();
        System.out.println("main: engine is working 1");
        System.out.println("main: engine is working 2");
        System.out.println("main: engine is working 3");
        facade.stopEngine();
    }
}
