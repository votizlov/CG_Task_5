package com.company;

public class ScreenConverter  {//todo сделать чтоб соотношение сторон при движении норм было
    private double xr,yr,wr,hr;
    private int ws,hs;

    public ScreenConverter(double xr,double yr,double wr,double hr, int ws, int hs) {
        this.xr = xr;
        this.yr = yr;
        this.wr = wr;
        this.hr = hr;
        this.ws = ws;
        this.hs = hs;
    }

    public ScreenVector2 realToScreen(Vector2 point) {
        int i = (int) ((point.getX() - xr) * ws / wr);
        int j = (int) ((yr - point.getY()) * hs / hr);
        return new ScreenVector2(i, j);
    }

    public Vector2 screenToReal(ScreenVector2 point) {
        double x = point.getI() * wr / ws + xr;
        double y = yr - point.getJ() * hr / hs;
        return new Vector2(x, y);
    }

    public int r2sX(double x) {
        return (int) ((x - xr) * ws / wr);
    }

    public int r2sY(double y) {
        return (int) ((yr - y) * hs / hr);
    }

    public double s2rX(int i) {
        return i * wr / ws + xr;
    }

    public double s2rY(int j) {
        return yr - j * hr / hs;
    }

    public double getXr() {
        return xr;
    }

    public void setXr(double xr) {
        this.xr = xr;
    }

    public double getYr() {
        return yr;
    }

    public void setYr(double yr) {
        this.yr = yr;
    }

    public double getWr() {
        return wr;
    }

    public void setWr(double wr) {
        this.wr = wr;
    }

    public double getHr() {
        return hr;
    }

    public void setHr(double hr) {
        this.hr = hr;
    }

    public int getHs() {
        return hs;
    }

    public void setHs(int hs) {
        this.hs = hs;
    }

    public int getWs() {
        return ws;
    }

    public void setWs(int ws) {
        this.ws = ws;
    }
}
