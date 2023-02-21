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

    @Test
    public void when547to123then6() {
        int expected = 6;
        int x1 = 5;
        int y1 = 4;
        int z1 = 7;
        int x2 = 1;
        int y2 = 2;
        int z2 = 3;
        double out = new Point(x1, y1, z1).distance3d(new Point(x2, y2, z2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when640to440then2() {
        int expected = 2;
        int x1 = 6;
        int y1 = 4;
        int z1 = 0;
        int x2 = 4;
        int y2 = 4;
        int z2 = 0;
        double out = new Point(x1, y1, z1).distance3d(new Point(x2, y2, z2));
        Assert.assertEquals(expected, out, 0.01);
    }
}