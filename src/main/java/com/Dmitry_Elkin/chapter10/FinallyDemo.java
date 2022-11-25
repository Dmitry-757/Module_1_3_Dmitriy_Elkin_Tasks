package com.Dmitry_Elkin.chapter10;

public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("procA ()");
            throw new RuntimeException("exception in procA()");
        }
        finally{
                System.out.println("finally block in procA ( ) ");
            }
        }
    static void procB ( ) {
        try {
            System.out.println("Exception in procB()");
            return; //try to exit ))
        } finally {
            System.out.println("finally block in procB()");
        }
    }

    static void procC() {
        try {
            System.out.println("procC()");
        } finally {
            System.out.println("finally block in procC()");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        }
        catch (Exception e){
            System.out.println("catch exception from called proc "+e.getMessage()+"\n");
        }
        procB();
        System.out.println();

        procC();
    }
}

