package com.Dmitry_Elkin.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

//Simple text editor
public class p03SimpleTextEditor {
    public static void main(String[] args) {
        try(
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
        ) {

            System.out.println("type some text, for quit type `stop`");
            String inStr;
            String[] inTxt = new String[10];
            int i = 0;
            while ( (i<10) && (!(inStr = br.readLine()).equals("stop")) ){
                inTxt[i] = inStr;
                i++;
            }
            for (int j = 0; j < i; j++) {
                System.out.println(inTxt[j]);
            }
            if (Arrays.stream(inTxt)
                    .filter(Objects::nonNull)
                    .filter(t->t.toUpperCase().contains("STOP"))
                    .count() == 0
            ){
                System.out.println("oops! memory is absent, but you do not type 'stop' ((");
            }

            System.out.println("bay! ;)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
