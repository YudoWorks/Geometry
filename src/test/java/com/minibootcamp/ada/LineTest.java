package com.minibootcamp.ada;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LineTest {

    @Test
    void testgetLengthGiven2SamePointsExpectReturnZero() {
        Point point = new Point(0, 0);
        Line line = new Line(point, point);

        assertEquals(0, line.getLength());
    }
}
