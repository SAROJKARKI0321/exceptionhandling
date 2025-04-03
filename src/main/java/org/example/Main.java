package org.example;

import java.io.*;

class FileReaderExample{
    static  void readFromFile(String fileName){
        try(BufferedReader reader=new BufferedReader(new FileReader(fileName))){
            String line=null;
            while ((line=reader.readLine())!=null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("ERROR"+e.getMessage());
        }

    }
}
public class Main {
    public static void main(String[] args) {
        // use a file  that deont exist to get error

        FileReaderExample.readFromFile("practise.txt");
    }
}





