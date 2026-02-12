package com.google;

public class App {

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
        App app = new App();
        int result = app.findGreatest(10, 20, 15);
        System.out.println("Greatest number is: " + result);
    }
}
