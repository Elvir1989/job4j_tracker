package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 0;
        int x = 0;
        int y = 0;
        double out = new Point(x, y).distance(new Point(x, y));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to01then1() {
        double expected = 0;
        int x = 1;
        int y = 1;
        double out = new Point(x, y).distance(new Point(x, y));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to00then2() {
        double expected = 0;
        int x = 2;
        int y = 0;
        double out = new Point(x, y).distance(new Point(x, y));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to21then2() {
        double expected = 0;
        int x = 0;
        int y = 1;
        double out = new Point(x, y).distance(new Point(x, y));
        Assert.assertEquals(expected, out, 0.01);
    }
}