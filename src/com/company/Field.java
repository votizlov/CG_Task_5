package com.company;

public class Field {
    private double friction;
    private double g;
    private Vector2 size;

    public Field(Vector2 size) {
        this.size = size;
        g = 9.8;
        friction = 0;
    }

    public double getFriction() {
        return friction;
    }

    public void setFriction(double friction) {
        this.friction = friction;
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }

    public Vector2 getSize() {
        return size;
    }

    public void setSize(Vector2 size) {
        this.size = size;
    }

    public Field(double friction, double g, Vector2 size) {
        this.friction = friction;
        this.g = g;
        this.size = size;
    }
}
