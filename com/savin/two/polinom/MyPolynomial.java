package com.savin.two.polinom;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyPolynomial {
    private List coeffsList;

    public MyPolynomial(double... coeffs){
        coeffsList = new ArrayList<Double>();

        if (coeffs != null){
            coeffsList.add(0,0d);
            for (int i = 0; i<=coeffs.length-1; i++){
                coeffsList.add(coeffs[i]);
            }
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

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || !(this.getClass().equals(object.getClass()))) return false;

        MyPolynomial that = (MyPolynomial) object;
        return Objects.equals(coeffsList, that.coeffsList);
    }

    @Override
    public int hashCode() {
        if (this.coeffsList == null){
            return 0;
        }
        else {
            int result = 17;

            for (int i = 0; i <= coeffsList.size() - 1; i++){
                Object temp = coeffsList.get(i);
                result = 31 * result + (temp == null? 0 : temp.hashCode());
            }
            return result;
        }
    }
}
