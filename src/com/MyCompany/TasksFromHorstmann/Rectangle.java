package com.BestCompany;

public class Rectangle extends Shape{
    private int x;
    private int y;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
    }

    public Rectangle(Rectangle rectangle) {
        super();
        this.x = rectangle.x;
        this.y = rectangle.y;
    }

    @Override
    public Point getCenter() {
        return null;
    }
}
