package com.BestCompany;

public class Line extends Shape{
    private int x;
    private int y;

    public Line(Point from, Point to) {
        super(from);
    }

    public Line(Line line) {
        super();
        this.x = line.x;
        this.y = line.y;
    }

    @Override
    public Point getCenter() {
        return null;
    }
}
