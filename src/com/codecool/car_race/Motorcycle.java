package com.codecool.car_race;
import java.util.Random;

public class Motorcycle extends Vehicle {
    Integer motorcycleNumber;
    String name;
    Integer motorCounter = 1;

    Integer distanceTraveled;

    public Motorcycle() {
        for (int i = 0; i < 11; i++) {
            this.motorcycleNumber = i;
            this.name = "Motorcycle " + motorcycleNumber;
        }
        /*
        this.motorcycleNumber = motorCounter;
        this.name = "Motorcycle " + motorcycleNumber;
        motorCounter++;
        */
        System.out.println(this.name);
    }

    public Integer getMotorcycleNumber() {
        return motorcycleNumber;
    }

    public String getName() {
        return name;
    }

    public void prepareForLap(Race race) {

    }

    public void moveForAnHour() {

    }
}
