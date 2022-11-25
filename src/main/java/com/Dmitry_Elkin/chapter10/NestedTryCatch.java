package com.Dmitry_Elkin.chapter10;

import java.util.Random;

public class NestedTryCatch {
    public static void main(String[] args) {
        int a, b = 0;
        int[] c = new int[2];
        Random r = new Random();

        try{

            a = 10 / 2;
            try {
                a = 10 / b;
                c[0] = a;
                c[10] = a;
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException "+e.getMessage());
            }

        }
        catch (ArithmeticException e){
            System.out.println("divide by zero was caught in external 'catch'" + e.getMessage());
            a = 0;
        }
    }
}


