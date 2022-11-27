package com.Dmitry_Elkin.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//чтение символов с консоли с помощью (System.in -> InputStreamReader -> BufferedReader)
public class p01ReadOfCharsFromConsole {
    public static void main(String[] args) {
        try(
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
        ) {
            char inChar;
            System.out.println("type some string, for quit type `q`");
            while ( (inChar = (char) br.read())!='q' ){
                System.out.println("you type : "+inChar);
            }
//            do{
//                inChar = (char) br.read();
//                System.out.println("you type : "+inChar);
//            }while ( inChar!='q' );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
