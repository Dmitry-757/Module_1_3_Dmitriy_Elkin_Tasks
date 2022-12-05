package com.Dmitry_Elkin.json;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class JSONByString {
    private static final String fileName = "students.txt";
    private static final Path file = Paths.get("students.txt");



    public static String getJSON2String(Object item){
        return new Gson().toJson(item);
    }

    public static Student getObjFromJSON(String jsonStr){
        return new Gson().fromJson(jsonStr, Student.class);
    }




    public static void main(String[] args) {
        Student name1 = new Student("John");
        Student name2 = new Student("Sophi");

        try {
            Files.write(file, List.of(getJSON2String(name1)));
            Files.write(file, List.of( getJSON2String(name2)), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (Scanner sc = new Scanner(file) ){
            while (sc.hasNext()){
                String str = sc.next();
                System.out.println(str);
                Student std = getObjFromJSON(str);
                System.out.println(std);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}

class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}