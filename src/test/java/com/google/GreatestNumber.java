package com.google;

public class GreatestNumber {

    public int findGreatest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        GreatestNumber gn = new GreatestNumber();
        int result = gn.findGreatest(10, 20, 15);
        System.out.println("Greatest number is: " + result);
    }
}
