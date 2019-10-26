package com.company;

public class Puck {

    private double r;
    private double m;
    private Vector2 pos;
    private Vector2 v;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }

    public Vector2 getPos() {
        return pos;
    }

    public void setPos(Vector2 pos) {
        this.pos = pos;
    }

    public Vector2 getV() {
        return v;
    }

    public void setV(Vector2 v) {
        this.v = v;
    }

    public Vector2 getA() {
        return a;
    }

    public void setA(Vector2 a) {
        this.a = a;
    }

    public Puck(double r, double m, Vector2 pos) {
        this.r = r;
        this.m = m;
        this.pos = pos;
    }

    public Puck(double r, double m, Vector2 pos, Vector2 v, Vector2 a) {
        this.r = r;
        this.m = m;
        this.pos = pos;
        this.v = v;
        this.a = a;
    }

    private Vector2 a;

}
