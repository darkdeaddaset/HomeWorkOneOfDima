package com.savin.one.circle;

import java.util.Objects;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(){}

    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || !(this.getClass().equals(object.getClass()))) return false;

        Circle circle = (Circle) object;
        return Double.compare(circle.radius, this.radius) == 0 && this.color.equals(circle.color);
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + (int) (Double.doubleToLongBits(radius) ^ (Double.doubleToLongBits(radius) >>> 32));
        result = 31 * result + (color == null ? 0 : color.hashCode());

        return result;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
