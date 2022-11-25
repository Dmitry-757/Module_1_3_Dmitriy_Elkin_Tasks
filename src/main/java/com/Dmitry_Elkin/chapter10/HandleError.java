package com.Dmitry_Elkin.chapter10;

import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        int a, b, c;
        Random r = new Random();
        for (int i = 0; i < 32000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println("Divide by zero!");
                a = 0;//set a = 0 and continue
            }
            System.out.println("a = " + a);
        }

    }
}
