package com.BestCompany;

public class Car {
    private double x;
    private double efficiency;
    private double fuel;

    public Car(double x, double efficiency, double fuel) {
        this.x = x;
        this.efficiency = efficiency;
        this.fuel = fuel;
    }

    public Car drove(int distance) {
        x += distance;
        fuel -= (distance * (efficiency / 100));
        return this;
    }

    public void Refuel(int litersOfFuel) {
        fuel += litersOfFuel;
    }

    public double getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Car{" +
                "x=" + x +
                ", efficiency=" + efficiency +
                ", fuel=" + fuel +
                '}';
    }
}
