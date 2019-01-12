package com.codecool.car_race;
import java.util.Random;

public class Motorcycle extends Vehicle {
    private static final int NORMAL_SPEED = 100;
    private static int motorcycleNumber = 1;

    public Motorcycle() {
        super(NORMAL_SPEED);
    }

    @Override
    public String generateName() {
        return "Motorcycle " + motorcycleNumber++;
    }

    @Override
    public void prepareForLap(Race race) {
        if (race.isRaining()) actualSpeed -= 25;
        else actualSpeed = normalSpeed;
    }

}
