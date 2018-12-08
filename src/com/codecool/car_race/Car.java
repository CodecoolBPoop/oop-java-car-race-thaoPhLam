package com.codecool.car_race;
import java.util.Random;

public class Car extends Vehicle {
    Integer normalSpeed;
    Random randSpeed = new Random();


    String name;
    String[] carNames =
            {"Avalanche", "Crown", "Silver", "Evolution", "Stardust",
                    "Temperament", "Hero", "Daydream", "Supremacy", "Tarragon"};
    Random randCarIndex = new Random();
    Integer oneCarNameIndex = randCarIndex.nextInt(10) + 1;
    String oneCarName = carNames[oneCarNameIndex];
    Integer otherCarNameIndex = randCarIndex.nextInt(10) + 1;
    String otherCarName = carNames[otherCarNameIndex];


    Integer distanceTraveled;

    public Car() {
        this.normalSpeed = randSpeed.nextInt(110 - 80 + 1) + 80;
        this.name = oneCarName + otherCarName;
        System.out.println(this.normalSpeed);
        System.out.println(this.name);
    }

    public String getNormalSpeed() {
        return normalSpeed.toString() + "km/h";
    }

    public String getName() {
        return name;
    }

    public void prepareForLap(Race race) {

    }

    public void moveForAnHour() {

    }
}
