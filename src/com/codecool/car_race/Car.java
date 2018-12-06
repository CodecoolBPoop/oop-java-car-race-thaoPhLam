package com.codecool.car_race;
import java.util.Random;

public class Car extends Vehicle {
    Integer normalSpeed;
    String name;
    int distanceTraveled;

    Random randSpeed = new Random();

    String[] carNames =
            {"Avalanche", "Crown", "Silver", "Evolution", "Stardust",
                    "Temperament", "Hero", "Daydream", "Supremacy", "Tarragon"};

    public Car() {
        this.normalSpeed = randSpeed.nextInt(110) + 80;
    }

    public String getNormalSpeed() {
        return normalSpeed.toString() + "km/h";
    }

    public void prepareForLap(Race race) {

    }

    public void moveForAnHour() {

    }
}
