package com.Dmitry_Elkin.chapter10;

public class ChainOfExceptionsDemo {

    static void procA(){
        ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException("upper level exception");
        e.initCause(new ArithmeticException("we created arithmetical exception"));
        throw e;
    }


    public static void main(String[] args) {
        try{
            procA();
        }
        catch (Exception e){
            System.out.println("exception = "+e.getMessage());
            System.out.println("reason of exception = "+e.getCause());
        }
    }
}
