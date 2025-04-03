package org.example;

import java.util.Scanner;

class MyOwnAgeException extends Exception{
    public MyOwnAgeException(String message){
        super(message);
    }
}
class CustomException {
    static void checkMarriageAge(int num) throws MyOwnAgeException {
        if (num < 21) {
            throw new MyOwnAgeException("21 isnt good age to marry");
        } else {
            System.out.println("We can marry though");
        }

    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner scanner= new Scanner(System.in);
        int yourAge=scanner.nextInt();
        try{
            CustomException.checkMarriageAge(yourAge);
        }catch (MyOwnAgeException e){
            System.out.println(e.getMessage());
        }

        }


    }





