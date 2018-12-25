package com.codecool.car_race;
import java.util.Random;

public class Car extends Vehicle {
    protected static final int YELLOW_FLAG_SPEED = 75;
    private static final Random randSpeed = new Random();

    private static final String[] carNames = {
            "Avalanche",
            "Crown",
            "Silver",
            "Evolution",
            "Stardust",
            "Temperament",
            "Hero",
            "Daydream",
            "Supremacy",
            "Tarragon"
    };


    public Car() {
        super(calculateNormalSpeed());
    }

    protected String generateName() {
        Random randCarIndex = new Random();
        Integer oneCarNameIndex = randCarIndex.nextInt(9) + 1;
        String oneCarName = carNames[oneCarNameIndex];
        Integer otherCarNameIndex = randCarIndex.nextInt(9) + 1;
        String otherCarName = carNames[otherCarNameIndex];
        return oneCarName + " " + otherCarName;
    }

    public void prepareForLap(Race race) {

    }

    private static int calculateNormalSpeed() {
        return randSpeed.nextInt(110 - 80 + 1) + 80;
    }
}
