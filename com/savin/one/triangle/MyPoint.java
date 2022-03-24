package com.savin.one.triangle;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint(){}

    public MyPoint(int x){
        this.x = x;
    }

    public MyPoint(int x, int y){
        this(x);
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
