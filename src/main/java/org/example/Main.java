package org.example;

public class Main {
    public static void checkNationality ( String country){
        if(country.toLowerCase().equals("nepal")){
            System.out.println("National");
        }else {
            throw  new IllegalArgumentException("*****International****");

        }

    }

    public static void main(String[] args) {
        checkNationality("nepal");
    }
}
