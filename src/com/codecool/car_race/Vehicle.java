package com.codecool.car_race;

public abstract class Vehicle {
    protected int normalSpeed;
    private String name;
    private int distanceTraveled;
    protected int actualSpeed;

    public Vehicle(int normalSpeed) {
        this.name = generateName();
        this.normalSpeed = normalSpeed;
    }

    protected abstract String generateName();

    public abstract void prepareForLap(Race race);

    public void moveForAnHour() {
        distanceTraveled += actualSpeed;
    }

    @Override
    public String toString() {
        return String.format(
                "[type: %s, name: %s, distanceTraveled: %d]",
                this.getClass().getSimpleName(),
                this.name,
                this.distanceTraveled
        );
    }
}
