package com.minibootcamp.ada;

public class Line {
    private Point firstPoint;
    private Point secondPoint;

    public Line(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public int getLength() {
        if (this.firstPoint.y == this.secondPoint.y) {
            if (this.firstPoint.x < this.secondPoint.x) {
                return secondPoint.x - firstPoint.x;
            } else if (this.firstPoint.x > this.secondPoint.x) {
                return firstPoint.x - secondPoint.x;
            }
        } else if (this.firstPoint.y > this.secondPoint.y) {
            return firstPoint.y - secondPoint.y;
        }

        return secondPoint.y - firstPoint.y;
    }
}
