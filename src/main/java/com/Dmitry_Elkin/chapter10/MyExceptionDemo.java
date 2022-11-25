package com.Dmitry_Elkin.chapter10;


class MyException extends Exception{

    public MyException(String message) {
        super(" it is my exception ) "+message);
    }
}

public class MyExceptionDemo {
    public static void main(String[] args) {
        System.out.println("а сейчас вызовем exception )");
        try {
            throw new MyException("Do you call me?");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
