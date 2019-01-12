package com.codecool.car_race;

public abstract class Vehicle {
    /*
    protected int normalSpeed;
    protected String name;
    protected int actualSpeed;
    protected int distanceTraveled;

    protected Vehicle(int normalSpeed) {
        this.normalSpeed = normalSpeed;
        this.name = generateName();
    }

    protected abstract String generateName();

    public abstract void prepareForLap(Race race);

    public final void moveForAnHour(){
        distanceTraveled += actualSpeed;
    }
    */

    protected int normalSpeed;
    private String name;
    private int distanceTraveled;
    protected int actualSpeed;

    public Vehicle(int normalSpeed) {
        this.normalSpeed = normalSpeed;
        this.name = name;
    }

    protected abstract String generateName();

    public abstract void prepareForLap(Race race);

    public void moveForAnHour() {
        distanceTraveled += actualSpeed;
    }
}
