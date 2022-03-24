package com.savin.two.complex;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex(){
        real = 0.0;
        imag = 0.0;
    }

    public MyComplex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real){
        this.real = real;
    }

    public void setImag(double imag){
        this.imag = imag;
    }

    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public boolean isReal(){
        return real == 0.0? false : true;
    }

    public boolean isImag(){
        return imag == 0.0? false : true;
    }

    @Override
    public String toString() {
        return "(real + imag): " +
                "(" + real + ")" +
                "+(" + imag + ")";
    }

    public boolean equals(double real, double imag) {
        if ((Double.compare(this.real, real) == 0) & (Double.compare(this.imag, imag) == 0)){
            return true;
        }
        else return false;
    }

    public boolean equals(MyComplex another){
        if ((Double.compare(real, another.getReal()) == 0) & (Double.compare(imag, another.getImag()) == 0)){
            return true;
        }
        else return false;
    }

    public double magnitude(){
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }

    public double argument(){
        return Math.toRadians(Math.atan(imag/real));
    }

    public MyComplex add(MyComplex right){
        right.setValue(this.real + right.getReal(),
                            this.imag + right.getImag());
        return right;
    }

    public MyComplex subtract(MyComplex right){
        right.setValue(this.real - right.getReal(),
                            this.imag - right.getImag());
        return right;
    }

    public MyComplex multiply(MyComplex right){
        double a = (this.real * right.getReal() - this.imag * right.getImag());
        double b = (this.real * right.getImag() + this.imag * right.getReal());
        right.setValue(a, b);

        return right;
    }

    public MyComplex addNew(MyComplex right){
        return new MyComplex(this.real + right.getReal(), this.imag + right.getImag());
    }

    public MyComplex subtractNew(MyComplex right){
        return new MyComplex(this.real - right.getReal(), this.imag - right.getImag());
    }

    public MyComplex conjugate(){
        MyComplex myComplex = getThisComplex();
        myComplex.setImag(myComplex.getImag() * -1);

        return myComplex;
    }

    public MyComplex getThisComplex(){
        return this;
    }
}
