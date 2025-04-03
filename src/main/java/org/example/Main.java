package org.example;

import java.io.*;

class OwnFileWriter{
    public  static  void writeToFile(String filename){
        try(BufferedWriter writer= new BufferedWriter(new FileWriter(filename,false))){
            writer.write("HEY I AM 4th LINE");
            writer.newLine();
        }catch (IOException e){
            System.out.println("I/O error"+ e.getMessage());
        }
    }

}
public  class Main {
    public static void main(String[] args) {
        OwnFileWriter.writeToFile("practise.txt");
    }
}





