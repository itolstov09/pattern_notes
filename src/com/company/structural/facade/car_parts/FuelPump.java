package com.company.structural.facade.car_parts;

public class FuelPump {
    public void on() {
        System.out.println("fuel pump started");
    }

    public void off() {
        System.out.println("Fuel pump stopped");
    }

    public void setFuelPressure(int airTemperature) {
        System.out.println("Fuel pressure set");
    }
}
