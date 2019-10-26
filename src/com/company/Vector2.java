package com.company;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Vector2 {
    private double x, y;

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2 add(Vector2 vector2) {
        return new Vector2(x+vector2.getX(),y+vector2.getY());
    }

    public Vector2 mult(double k) {
        return new Vector2(x*k,y*k);
    }

    public Vector2 normalized() {
        double l = sqrt(x * x + y * y);
        if (abs(l) < 1e-10)
            return new Vector2(0, 0);
        return new Vector2(x / l, y / l);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "RealPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
