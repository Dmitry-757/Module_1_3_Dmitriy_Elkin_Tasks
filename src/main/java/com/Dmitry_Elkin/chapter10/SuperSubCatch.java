package com.Dmitry_Elkin.chapter10;

import java.util.Random;

public class SuperSubCatch {
    public static void main(String[] args) {
        Random r = new Random();
        int a = 0, b;

        int[] arr = new int[100];
        for (int i = 0; i < 32000; i++) {
            try {
                b = r.nextInt(0, 110);
                a = 123 / b;

                arr[b] = a;
            }catch (Exception e){
                System.out.println("everything after is unReachable !!!");
//            } catch (ArithmeticException e) {
//                System.out.println("arithmetical exception " + e);
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("ArrayIndexOutOfBoundsException " + e);
            }
            System.out.println("a = "+a);
        }
    }
}
