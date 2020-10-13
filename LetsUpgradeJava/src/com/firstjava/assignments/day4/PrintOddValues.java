package com.firstjava.assignments.day4;

/*
Questions 2:
Create an int array with 5 values and print only odd values.
 */
public class PrintOddValues {

    public static void main(String[] args) {

        int[] values = new int[5];
        values[0]=1;
        values[1]=2;
        values[2]=3;
        values[3]=4;
        values[4]=5;

        for(int i=0; i<5; i++) {
            if ((values[i]%2) != 0){
                System.out.println("The odd number is: " + values[i]);
            }
        }

    }
}
