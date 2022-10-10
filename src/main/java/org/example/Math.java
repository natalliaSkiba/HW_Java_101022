package org.example;

public class Math {
    private double result;

public void  getSum(int a, int b) {
    result = a + b;
}
public void  getSub(int a, int b) {
    result = a - b;
}
public void  getMul(int a, int b) {
    result = a * b;
}

public void  getDel(int a, int b) {
    result = a / b;
}

public double getResult() { return result;}

}
