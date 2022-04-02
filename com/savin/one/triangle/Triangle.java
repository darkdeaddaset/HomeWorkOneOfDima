package com.savin.one.triangle;

import static java.lang.Math.pow;

public class Triangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public Triangle(int x1, int y1,
                    int x2, int y2,
                    int x3, int y3){
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public Triangle(MyPoint v1,
                    MyPoint v2,
                    MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=(" + v1.getX() + "," + v1.getY() + ")," +
                "v2=(" + v2.getX() + "," + v2.getY() + ")," +
                "v3=(" + v3.getX() + "," + v3.getY() + ")" +
                ']';
    }

    public double getPerimeter(){
        return getSide(v1, v2) + getSide(v3, v2) + getSide(v3, v1);
    }

    public double getSide(MyPoint v1, MyPoint v2){
        return Math.sqrt(pow(v2.getX() - v1.getX(), 2) + pow(v2.getY() - v1.getY(), 2));
    }

    public String getType(){
        if ((Double.compare(getSide(v1,v2), getSide(v2, v3)) == 0) & (Double.compare(getSide(v2,v3), getSide(v3, v1)) == 0)){
            return "Equilateral";
        }
        if ((Double.compare(getSide(v1, v2), getSide(v2, v3)) != 0) & (Double.compare(getSide(v2, v3), getSide(v3, v1)) != 0)){
            return "Scalene";
        }
        else{
            return "Isosceles";
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || !(this.getClass().equals(object.getClass()))) return false;

        Triangle triangle = (Triangle) object;
        return this.v1.equals(triangle.v1) && this.v2.equals(triangle.v2) && this.v3.equals(triangle.v3);
    }

    @Override
    public int hashCode() {
        int result = 17;

        Object[] objs = {v1, v2, v3};
        for (int i = 0; i <= objs.length-1; i++){
            Object temp = objs[i];
            result = 31 * result + (temp == null ? 0 : temp.hashCode());
        }

        return result;
    }
}
