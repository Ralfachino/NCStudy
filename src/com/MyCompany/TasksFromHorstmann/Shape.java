package com.BestCompany;

public abstract class Shape {
    private Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public Shape() {

    }


    public void moveBy(double dx, double dy) {
        point.setX(dx);
        point.setY(dy);
    }

    public abstract Point getCenter();



}
