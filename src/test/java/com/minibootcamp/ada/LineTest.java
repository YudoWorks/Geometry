package com.minibootcamp.ada;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LineTest {

    @Test
    void testgetLengthGiven2SamePointsExpectReturnZero() {
        Point point = new Point(0, 0);
        Line line = new Line(point, point);

        assertEquals(0, line.getLength());
    }

    @Test
    void testgetLengthGiven2PointsThatYIsSameAndFirstPointXIsLessThanTheSecondPointExpectReturnDeltaX() {
        int deltaX = 3;
        Point firstPoint = new Point(2, 0);
        Point secondPoint = new Point(5, 0);
        Line line = new Line(firstPoint, secondPoint);

        assertEquals(deltaX, line.getLength());
    }

    @Test
    void testgetLengthGiven2PointsThatYIsSameAndFirstPointXIsGreaterThanTheSecondPointExpectReturnDeltaX() {
        int deltaX = 3;
        Point firstPoint = new Point(5, 0);
        Point secondPoint = new Point(2, 0);
        Line line = new Line(firstPoint, secondPoint);

        assertEquals(deltaX, line.getLength());
    }

    @Test
    void testgetLengthGiven2PointsThatXIsSameAndFirstPointXIsLessThanTheSecondPointExpectReturnDeltaY() {
        int deltaY = 3;
        Point firstPoint = new Point(0, 2);
        Point secondPoint = new Point(0, 5);
        Line line = new Line(firstPoint, secondPoint);

        assertEquals(deltaY, line.getLength());
    }

    @Test
    void testgetLengthGiven2PointsThatXIsSameAndFirstPointXIsGreaterThanTheSecondPointExpectReturnDeltaY() {
        int deltaY = 3;
        Point firstPoint = new Point(0, 5);
        Point secondPoint = new Point(0, 2);
        Line line = new Line(firstPoint, secondPoint);

        assertEquals(deltaY, line.getLength());
    }

    @Test
    void testisEqualGiven2SameLineExpectReturnTrue() {
        Point point = new Point(0, 0);
        Line line = new Line(point, point);

        assertTrue(Line.isEqual(line, line));
    }
}
