package com.company.creational.builder.builder;

import com.company.creational.builder.car.CarType;
import com.company.creational.builder.components.Engine;
import com.company.creational.builder.components.GPSNavigator;
import com.company.creational.builder.components.Transmission;
import com.company.creational.builder.components.TripComputer;

public interface CarBuilder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
