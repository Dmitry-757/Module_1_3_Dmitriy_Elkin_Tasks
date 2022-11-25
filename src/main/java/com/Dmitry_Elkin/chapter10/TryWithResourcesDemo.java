package com.Dmitry_Elkin.chapter10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourcesDemo {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in);){
            System.out.println("print anything");
            String str = sc.nextLine();
            System.out.println("you print: "+str);

            System.out.println("input number");
            int i = sc.nextInt();
            System.out.println("you print: "+i);

            int b = 10 / i;
        }
        catch (InputMismatchException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e){
                System.out.println(e.getMessage());
        }
    }
}
