package com.Dmitry_Elkin.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//let's try to write file with help of FileOutputStream
//and read it by the FileInputStream
public class p03FileWriteRead {
    public static void main(String[] args) {
        writeFile();
        readFile(null);
        copyFile();
    }


    public static void writeFile(){
        String fileName = "myFile.txt";
        String myText = "some text for writing to file";

        try(
                FileOutputStream fos = new FileOutputStream(fileName);
        ) {
            byte[] byteBuffer = myText.getBytes();
            fos.write(byteBuffer);
            System.out.println("file was written");
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("io error");
        }
    }

    public static void readFile(String fname) {
        String fileName;
        fileName = ((fname == null) ? "myFile.txt" : fname);

        System.out.println();
        System.out.println("read file "+fileName);
        try(FileInputStream fis = new FileInputStream(fileName)){
            System.out.println("File size is "+fis.available()+" bytes");
            int i = -1;
            while((i = fis.read()) != -1){
                System.out.print((char)i);
            }
            System.out.print("\n");

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("io error");
        }
    }

    public  static void copyFile(){
        String fileNameFrom = "myFile.txt";
        String fileNameTo = "myFile2.txt";

        try(
                FileInputStream fis = new FileInputStream(fileNameFrom);
                FileOutputStream fos = new FileOutputStream(fileNameTo);
        ){
            int i = -1;
            while((i = fis.read()) != -1){
                fos.write(i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("io error");
        }

        readFile(fileNameTo);
    }
}

