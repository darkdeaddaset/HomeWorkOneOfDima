package com.savin.two.ball;

public class Container {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Container(int x, int y,
                     int width, int height){
        this.x1 = x;
        this.y1 = y;
        x2 = width + x1;
        y2 = height - y2;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getWidth() {
        return x2;
    }

    public int getHeight() {
        return y2;
    }

    public boolean collides(Ball ball){
        return !(ball.getX() - ball.getRadius() <= this.x1 || ball.getX() - ball.getRadius() >= this.x2);
    }

    @Override
    public String toString() {
        return "Container{[" +
                x1 + ", " + y1 + ")" +
                ", (" + x2 +
                ", " + y2 + ")" +
                '}';
    }
}
