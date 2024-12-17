package org.example;

public class Calculator {

    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int sum() { // Changed to public
        return a + b;
    }
    public int exp() { // Changed to public
        int res = 1;
        for (int i = 0; i < b; i++) {
            res = res * a;
        }
        return res;
    }
}