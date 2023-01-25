package com.company.structural.facade;

import com.company.structural.facade.car_parts.AirController;
import com.company.structural.facade.car_parts.CoolingController;
import com.company.structural.facade.car_parts.FuelPump;
import com.company.structural.facade.car_parts.Starter;

public class CarEngineFacade {
    private AirController airController;
    private CoolingController coolingController;
    private FuelPump fuelPump;
    private Starter starter;

    public CarEngineFacade(
            AirController airController,
            CoolingController coolingController,
            FuelPump fuelPump,
            Starter starter
    ) {
        this.airController = airController;
        this.coolingController = coolingController;
        this.fuelPump = fuelPump;
        this.starter = starter;
    }

    public void startEngine() {
        coolingController.setTempUpperLimit(90);
        coolingController.run();
        airController.on();
        fuelPump.setFuelPressure(airController.getAirTemperature());
        fuelPump.on();
        starter.start();
        System.out.println("ENGINE STARTED");
    }

    public void stopEngine() {
        fuelPump.off();
        coolingController.setTempUpperLimit(50);
        coolingController.runUntilCooled();
        airController.off();
        System.out.println("ENGINE STOPPED");
    }
}
