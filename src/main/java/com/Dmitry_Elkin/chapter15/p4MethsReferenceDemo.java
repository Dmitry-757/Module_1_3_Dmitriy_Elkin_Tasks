package com.Dmitry_Elkin.chapter15;

import java.security.Provider;
import java.util.function.Supplier;

public class p4MethsReferenceDemo {
    @FunctionalInterface
    interface MyFuncI {
        int calc(int a, int b);
    }

    static class ClassWithMethods {
        static String getSomeString() {
            return "Some string";
        }

        static int sum(int a, int b) {
            return a + b;
        }
    }


    public static void main(String[] args) {
        MyFuncI myCalc = ClassWithMethods::sum; //сигнатура у интерфейса сходна с сигнатурой метода класса - значит можем использовать
        System.out.println("Вызов метода по ссылке "+myCalc.calc(1,2));

        //Functional interface Supplier<T> - ничего не принимает на вход, выдает результат типа T, имеет один метод get()
        Supplier<String> getStr = ClassWithMethods::getSomeString;
        System.out.println("Вызов метода по ссылке : "+getStr.get());

    }
}
