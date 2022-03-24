package com.savin.one.rectangle;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    public Rectangle(){}

    public float getLength(){
        return length;
    }

    public float getWidth(){
        return width;
    }

    public void setLength(float length){
        this.length = length;
    }

    public void setWidth(float width){
        this.width = width;
    }

    public float getArea(){
        return length * width;
    }

    public float getPerimeter(){
        return (length + width) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}