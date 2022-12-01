package com.Dmitry_Elkin.chapter15;
@FunctionalInterface
interface SumFuncI<T> {
    T func(T t);
}

public class p02GenericFuncInterfaceDemo {
    public static void main(String[] args) {
        SumFuncI<Integer> myFunc = (a) -> a * a;

        System.out.println("a * a = " + myFunc.func(2));
    }
}
