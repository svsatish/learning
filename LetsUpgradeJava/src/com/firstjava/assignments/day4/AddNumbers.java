package com.firstjava.assignments.day4;

import java.util.Scanner;

/*
Questions 3:
Create an int array of size 5, take all the values from the user, add all the values and print the sum.
 */
public class AddNumbers {

    public static void main(String[] args) {

    int[] numbers = new int[5];
    Scanner scanner = new Scanner(System.in);
    int result=0;

    for(int i = 0; i<5; i++) {
        System.out.print("Please enter any number for index " + (i+1) + "/" + numbers.length + ": ");
        numbers[i] = scanner.nextInt();
        result += numbers[i];
    }

        System.out.println("The sum of 5 numbers entered is: " + result);
}
}
