package com.Dmitry_Elkin.chapter15;

//func interface
@FunctionalInterface
interface MyNumberI {
    double getValue();
}

interface MyMethI {
    int getValue(int a, int b);
}


public class p01LambdaDemo {
    public static void main(String[] args) {
        //получаем экземпляр анонимного класса, в котором есть метод getValue(), этот метод реализуем лямбда-выражением
        MyNumberI myLambda = () -> 123.45; //главное  "чтоб костюмчик сидел (с)" - сигнатура подходила
        // сигнатура = количество и типы входящих параметров + тип выходного результата
        System.out.println("вызов метода 1 : " + myLambda.getValue());

        //под эту сигнатуру можно прикрутить очень многое
        myLambda = () -> Math.random() * 100;
        System.out.println("вызов метода 2 : " + myLambda.getValue());

        MyMethI myLambda2 = (a, b) -> a + b;
        System.out.println("вызов метода 3 : " + myLambda2.getValue(1, 2));

        myLambda2 = (a, b) -> {
            int c = a + b;
            return c * 100;
        };
        System.out.println("вызов метода 4 : " + myLambda2.getValue(3, 2));

        myLambda2 = (a, b) ->{
            int result = 1;
            for (int j = 1; j <= a; j++) {
                result = result * j ;
            }
            return result;
        };
        System.out.println("factorial(3) = "+myLambda2.getValue(3, 0));
    }
}
