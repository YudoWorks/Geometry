package com.minibootcamp.ada;

public class Line {
    private Point firstPoint;
    private Point secondPoint;

    public Line(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public int getLength() {
        if (this.firstPoint.y == this.secondPoint.y && this.firstPoint.x < this.secondPoint.x) {
            return secondPoint.x - firstPoint.x;
        }

        return 0;
    }
}
