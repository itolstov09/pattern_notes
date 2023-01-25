package com.company.structural.facade.car_parts;

public class AirController {
    public int getAirTemperature() {
        System.out.println("Air controller: get air temp");
        return 20;
    }

    public void on() {
        System.out.println("Air controller: on");
    }

    public void off() {
        System.out.println("Air controller: off");
    }
}
