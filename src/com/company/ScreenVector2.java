package com.company;

public class ScreenVector2 {
    private int i,j;

    public ScreenVector2(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getJ() {
        return j;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "ScreenPoint{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }

    public void setJ(int j) {
        this.j = j;
    }
    //get construct
}
