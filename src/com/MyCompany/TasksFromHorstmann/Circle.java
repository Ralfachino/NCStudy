package com.BestCompany;

public class Circle extends Shape {
    private int x;
    private int y;
    private double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    public Circle(Circle circle) {
        super();
        this.x = circle.x;
        this.y = circle.y;
        this.radius = circle.radius;
    }

    @Override
    public Point getCenter() {
        return null;
    }
}
