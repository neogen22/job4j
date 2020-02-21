package ru.job4j.oop;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point3D {

    private int x;
    private int y;
    private int z;

    public Point3D(int first, int second) {
        this.x = first;
        this.y = second;
    }
    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point3D that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point3D that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
        Point3D a = new Point3D(2, 1, 4);
        Point3D b = new Point3D(4, 2, 6);
        double dist = a.distance3d(b);
        System.out.println(dist);
    }
}
