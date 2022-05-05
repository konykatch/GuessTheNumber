package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameOn = true;
        while(gameOn) {
            picker();
            System.out.println("Play again?[y/n]");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("y")) {
                picker();
            } else {
                System.out.println("goodbye");
                gameOn = false;
            }
        }
    }
    public static void picker(){
        int computerNumber = (int) (Math.random()*100 + 1);
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int userNumber = 0;
        while (userNumber != computerNumber) {
            System.out.println("Type a number: ");
            userNumber = scanner.nextInt();
            guesser(computerNumber, userNumber, count);
            count++;
        }
    }
    public static void guesser(int computerNumber,int userNumber,int count){
        if(computerNumber>userNumber){
            System.out.println("My number is higher than your Number. Try number: "+count);
        }else if(computerNumber<userNumber){
            System.out.println("MY number is lower than your Number. Try number: "+count);
        }else{
            System.out.println("you win after "+count+" tries");
        }
    }
}






