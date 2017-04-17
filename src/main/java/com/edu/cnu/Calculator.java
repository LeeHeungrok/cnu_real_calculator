package com.edu.cnu;

/**
 * Created by leeheungrok on 2017. 4. 17..
 */
public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int dividBy(int a, int b){
        return a / b;
    }

    public int factorial(int a){
        if(a == 1){
            return 1;
        } else {
            return factorial(a) * factorial(a - 1);
        }
    }
}
