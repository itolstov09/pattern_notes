package com.company.structural.facade.car_parts;

public class CoolingController {
    public void setTempUpperLimit(int temperature) {
        System.out.println("Cooling system temperature set to: " + temperature);
    }

    public void run() {
        System.out.println("Cooling system started");
    }

    public void runUntilCooled() {
        System.out.println("System run until cooled");
    }
}
