package com.Dmitry_Elkin.chapter20_io;

import java.io.File;

public class p01FileDemo {
    public static void main(String[] args) {
        File file = new File("test.txt");
        System.out.println("file name is "+file.getName());
        System.out.println("path is "+file.getPath());
        System.out.println("the absolute path is "+file.getAbsolutePath());
        System.out.println("the parent catalog is "+file.getParent());
        System.out.println("the file is exist : "+file.exists());
        System.out.println("the file is directory : "+file.isDirectory());
        System.out.println("last modified : "+file.lastModified());
        System.out.println("the size is "+file.length());
    }
}
