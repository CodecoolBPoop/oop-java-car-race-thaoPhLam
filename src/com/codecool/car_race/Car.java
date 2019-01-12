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

    @Override
    protected String generateName() {
        Random randFirstName = new Random();
        int indexRandFirstName = randFirstName.nextInt(9) + 1;
        String firstName = carNames[indexRandFirstName];

        Random randLastName = new Random();
        int indexRandLastName = randLastName.nextInt(9) + 1;
        String lastName = carNames[indexRandLastName];

        return firstName + " " + lastName;
    }

    private static int generateNormalSpeed() {
        return randSpeed.nextInt(110-80+1) + 80;
    }

    public Car() {
        super(generateNormalSpeed());
    }

    @Override
    public void prepareForLap(Race race) {
        if (race.isThereABrokenTruck()) actualSpeed = YELLOW_FLAG_SPEED;
        else actualSpeed = normalSpeed;
    }
}
