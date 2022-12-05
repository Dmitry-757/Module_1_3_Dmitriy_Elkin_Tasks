package com.Dmitry_Elkin.chapter15;


public class p03PassLamdaAsArgument {
    @FunctionalInterface
    interface SumFuncI<T> {
        T func(T t);
    }

    public static void objectiveFunc(SumFuncI<Integer> myFunc, int a ){
        System.out.println(myFunc.func(a));
    }

    public static void main(String[] args) {
        SumFuncI<Integer> myLambda = (a)->a*a;

        objectiveFunc(myLambda, 2);
    }
}
