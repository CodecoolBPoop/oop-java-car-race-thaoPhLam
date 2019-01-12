package com.codecool.car_race;

import java.util.Random;

public class Truck extends Vehicle {
    private static int normalSpeed = 100;
    private Random rand = new Random();

    public Truck() {
        super(normalSpeed);
    }

    @Override
    protected String generateName() {
        return Integer.toString(rand.nextInt(1000));
    }

    @Override
    public void prepareForLap(Race race) {
        if (race.isThereABrokenTruck()) actualSpeed -= 33;
        else actualSpeed = normalSpeed;
    }
}
