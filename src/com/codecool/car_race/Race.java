package com.codecool.car_race;

import java.util.LinkedList;
import java.util.List;

public class Race {
    private static final int SUM_OF_LAPS = 50;
    private final List<Vehicle> vehicles = new LinkedList<>();

    public void registerRacer(Vehicle racer) {
        vehicles.add(racer);
    }

    public void simulateRace() {
        for (int i = 0; i < SUM_OF_LAPS; i++) {
            for (Vehicle vehicle : vehicles) {
                vehicle.prepareForLap(this);
                vehicle.moveForAnHour();
            }
        }
    }

    public void printRaceResults() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.generateName());
        }
    }

    public boolean isThereABrokenTruck() {
        return true;
    }

    private Weather weather = new Weather();

    public boolean isRaining() {
        return weather.isRaining();
    }
}
