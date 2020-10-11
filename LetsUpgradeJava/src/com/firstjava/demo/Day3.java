package com.firstjava.demo;

import java.util.Scanner;

public class Day3 {

    public static void main(String[] args) {

        // take user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        System.out.println(num);
        scanner.nextLine();
        System.out.println("Hello, what's your name?");
        String message = scanner.nextLine();
        System.out.println(message);


        // conditions - if & else - used for range of values
        // print based on conditions by taking user inputs
        if(num>75 && num<=100){
            System.out.println("You got 'A' grade");
        }else if(num>60 && num<=74){
            System.out.println("You got 'B' grade");
        }else if(num>40 && num <=60){
            System.out.println("You got 'C' grade");
        }else{
            System.out.println("You 'Failed', please study hard");
        }

        // condition - switch - used for a single value
        switch(num) {
            case 4:
                System.out.println("The number is 4");
                break;
            case 5:
                System.out.println("The number is 5");
                break;
            case 6:
                System.out.println("The number is 6");
                break;
            default:
                System.out.println("The number is not present");
                break;
        }



    }
}
