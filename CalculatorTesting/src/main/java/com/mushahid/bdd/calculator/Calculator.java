package com.mushahid.bdd.calculator;

public class Calculator {
	private int result;
	 
    public void add(int arg1, int arg2) {
        result = arg1 + arg2;
    }
    public void multiply(int arg1, int arg2) {
        result = arg1 * arg2;
    }
    public void subs(int arg1, int arg2) {
        result = arg2 - arg1;
    }
    
    public void devide(int arg1, int arg2) {
        result = arg1 / arg2;
    }
    public int getResult() {
        return result;
    }
}
