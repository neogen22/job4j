package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;
    private double a;
    private double b;
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }
    public double pointSqrt (Point that) {
        this.a = pow(this.x - that.x, 2);
        this.b = pow(this.y - that.y, 2);
        return a + b;

    }
    public double distance(Point that) {
        return sqrt(pointSqrt(that));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}