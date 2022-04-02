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

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || !(this.getClass().equals(object.getClass()))) return false;

        MyPoint myPoint = (MyPoint) object;
        return this.x == myPoint.x && this.y == myPoint.y;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + x;
        result = 31 * result + y;

        return result;
    }
}
