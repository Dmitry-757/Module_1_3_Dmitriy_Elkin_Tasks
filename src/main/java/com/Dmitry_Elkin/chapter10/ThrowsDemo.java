package com.Dmitry_Elkin.chapter10;

//let`s show how to pass exception
public class ThrowsDemo {
    static void procWithException() throws NullPointerException{
            throw new NullPointerException("exception from proc");
    }

    public static void main(String[] args) {
        try{
            procWithException();
        }
        catch (NullPointerException e){
            System.out.println("exception was caught in upper level : "+e.getMessage());
        }
    }
}
