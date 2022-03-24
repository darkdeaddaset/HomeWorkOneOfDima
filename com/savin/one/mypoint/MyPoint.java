package com.savin.one.mypoint;

import static java.lang.Math.pow;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint(){}

    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    public int[] getXY(){
        int[] xy = new int[2];
        for (int i = 0; i <= xy.length-1; i++){
            if (i == 0){
                xy[i] = this.x;
            }
            else {
                xy[i] = this.y;
            }
        }
        return xy;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;

        int[] z = new int[2];
        for (int i = 0; i<=z.length-1; i++){
            if (i == 0){
                z[i] = x;
            }
            else z[i] = y;
        }
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(int x, int y){
        return Math.sqrt(pow(x-this.x,2) + pow(y-this.y,2));
    }

    public double distance(MyPoint another){
        return Math.sqrt(pow(another.x - x, 2) + pow(another.y - y,2));
    }

    public double distance(){
        return Math.sqrt(pow(0 - x, 2) + pow(0 - y, 2));
    }
}
