package com.Dmitry_Elkin.chapter10;


public class myExceptionThrowing {
    public static void doSomething() throws Exception {
        throw new ArithmeticException("exc");
    }

    public static void main(String[] args) {
        try {
            doSomething();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException was couch");
        } catch (Exception e) {
            System.out.println("exception was couch");
        }
    }
}
