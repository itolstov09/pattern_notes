package com.company.creational.builder.refactoring_guru.builder;

import com.company.creational.builder.refactoring_guru.car.CarType;
import com.company.creational.builder.refactoring_guru.components.Engine;
import com.company.creational.builder.refactoring_guru.components.GPSNavigator;
import com.company.creational.builder.refactoring_guru.components.Transmission;
import com.company.creational.builder.refactoring_guru.components.TripComputer;

public interface CarBuilder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
