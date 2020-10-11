package com.firstjava.assignments.day3;

import java.util.Scanner;

/*
  Take 5 subject marks > each 100
  Calculate the percentage
  Based on the %, print percentage and Grade
*/
public class PercentageGrade {

    public static void main(String[] args) {

        double subject1, subject2, subject3, subject4, subject5, percentage;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Subject1 marks:");
        subject1 = scanner.nextDouble();
        assertMarksEntered(subject1);
        System.out.print("Enter Subject2 marks:");
        subject2 = scanner.nextDouble();
        assertMarksEntered(subject2);
        System.out.print("Enter Subject3 marks:");
        subject3 = scanner.nextDouble();
        assertMarksEntered(subject3);
        System.out.print("Enter Subject4 marks:");
        subject4 = scanner.nextDouble();
        assertMarksEntered(subject4);
        System.out.print("Enter Subject5 marks:");
        subject5 = scanner.nextDouble();
        assertMarksEntered(subject5);

        percentage = ((subject1 + subject2 + subject3 + subject4 + subject5) / 500d) * 100d;
        System.out.print("Percentage is " + percentage + " and ");

        if (percentage > 75 && percentage <= 100) {
            System.out.println("You got 'A' grade");
        } else if (percentage > 60 && percentage <= 75) {
            System.out.println("You got 'B' grade");
        } else if (percentage > 40 && percentage <= 65) {
            System.out.println("You got 'C' grade");
        } else if (percentage > 30 && percentage <= 40) {
            System.out.println("You got 'D' grade");
        } else {
            System.out.println("You 'Failed', study hard");
        }
    }

    private static void assertMarksEntered(double subject) {
        if (subject >= 100.0) {
            AssertionError assertionError = new AssertionError();
            System.out.println("The marks entered should be less than 100.00");
            throw assertionError;
        }
    }
}
