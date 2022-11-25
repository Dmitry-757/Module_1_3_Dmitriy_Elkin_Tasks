package com.Dmitry_Elkin.chapter10;

//let`s show the 'throw' operator
public class ThrowDemo {
    static void procWithException(){
        try{
            throw new NullPointerException("my exception in proc");
        }
        catch (NullPointerException e){
            System.out.println("exception was caught inside of procedure");
            throw e;//pass exception forward
        }
    }

    public static void main(String[] args) {
        try{
            procWithException();
        }
        catch (NullPointerException e){
            System.out.println("exception was caught in upper level "+e.getMessage());
        }
    }
}
