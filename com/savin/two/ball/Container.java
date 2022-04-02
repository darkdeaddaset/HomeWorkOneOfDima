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
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || !(this.getClass().equals(object.getClass()))) return false;

        Container container = (Container) object;
        return this.x1 == container.x1 && this.x2 == container.x2 && this.y1 == container.y1 && this.y2 == container.y2;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + x1;
        result = 31 * result + x2;
        result = 31 * result + y1;
        result = 31 * result + y2;

        return result;
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
