package com.Dmitry_Elkin.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//чтение строки с консоли с помощью (System.in -> InputStreamReader -> BufferedReader)
public class p02ReadLinesFromConsole {
    public static void main(String[] args) {
        try(
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
        ) {
            System.out.println("type some string, for quit type `exit`");
            String inStr;
            while ( !(inStr = br.readLine()).equals("exit") ){
                System.out.println("you type : "+inStr);
            }
            System.out.println("bay! ;)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
