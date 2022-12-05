package com.Dmitry_Elkin.chapter20_io;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;

public class p02DirDemo {
    public static void main(String[] args) {
        File file = new File("test.txt");
        String absPath = file.getAbsolutePath();
        String dir = absPath.substring (0, absPath.length() - "test.txt".length());
        File d = new File(dir);
        System.out.println(d);
        if (d.isDirectory()){

            String[] s = d.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(d+"/"+s[i]);
                if (f.isDirectory()){
                    System.out.println(s[i]+" is directory");
                } else {
                    System.out.println(s[i]+" is file");
                }
            }
            System.out.println("\n and now with filter \n");
            s = d.list((directory, name) -> name.endsWith(".txt"));
            for (int i = 0; i < s.length; i++) {
                File f = new File(d+"/"+s[i]);
                if (f.isDirectory()){
                    System.out.println(s[i]+" is directory");
                } else {
                    System.out.println(s[i]+" is file");
                }
            }
        }else {
            System.out.println(d+" is not directory");
        }


    }
}
