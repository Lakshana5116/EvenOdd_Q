package com.lab;

public class EvenOdd {

    public String checkNumber(int n) {
        return n % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd();
        System.out.println(obj.checkNumber(10));
        System.out.println(obj.checkNumber(7));
    }
}
