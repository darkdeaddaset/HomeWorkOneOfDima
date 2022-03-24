package com.savin.two.polinom;

import java.util.ArrayList;
import java.util.List;

public class MyPolynomial {
    private List coeffsList;

    public MyPolynomial(double... coeffs){
        coeffsList = new ArrayList<Double>();

        coeffsList.add(0,0d);
        for (int i = 0; i<=coeffs.length-1; i++){
            coeffsList.add(coeffs[i]);
        }
    }

    @Override
    public String toString() {
        return "MyPolynomial{" +
                "coeffsList=" + coeffsList +
                '}';
    }

    public void setCoeffs(double[] coeffs){
        for (int i = 1; i <= coeffs.length-1; i++){
            coeffsList.add(coeffs[i]);
        }
    }

    public int getDegree(){
        return coeffsList.size();
    }

    public MyPolynomial add(MyPolynomial right){
        double[] temp = new double[coeffsList.size()];
        MyPolynomial myPolynomial = new MyPolynomial();

        for (int i = 1; i<=coeffsList.size()-1; i++){
            temp[i] = (double) coeffsList.get(i) + (double) right.coeffsList.get(i);
            System.out.println(temp[i]);
        }
        myPolynomial.setCoeffs(temp);

        return myPolynomial;
    }


    public MyPolynomial multiply(MyPolynomial right){
        double[] temp = new double[coeffsList.size()];
        MyPolynomial myPolynomial = new MyPolynomial();

        for (int i = 1; i<=coeffsList.size()-1; i++){
            temp[i] = (double) coeffsList.get(i) * (double) right.coeffsList.get(i);
            System.out.println(temp[i]);
        }
        myPolynomial.setCoeffs(temp);

        return myPolynomial;
    }
}
