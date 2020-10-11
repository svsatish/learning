package com.firstjava.assignments.day3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/*
   Take employee name, date of birth, month of birth, year of birth, monthly salary
   tax is accounted for
   5l - 20%
   4l - 15%
   3l - 10%
   2l - 5%

   Display name, age, annual salary and tax amount
*/
public class EmployeeDetails {

    public static void main(String[] args) {

        String employeeName;
        int dob, mob, yob;
        float monthlySalary, annualSalary, taxAmount;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        employeeName = scanner.nextLine();
        System.out.print("Enter day of birth as integer. Example-30: ");
        dob = scanner.nextInt();
        System.out.print("Enter month of birth as integer. Example-10: ");
        mob = scanner.nextInt();
        System.out.print("Enter year of birth as integer. Example-1980: ");
        yob = scanner.nextInt();
        System.out.print("Enter monthly salary as number. Example-75000: ");
        monthlySalary = scanner.nextInt();

        LocalDate startDateInclusive = LocalDate.of(yob, mob, dob);
        LocalDate endDateExclusive = LocalDate.now();
        Period age = Period.between(startDateInclusive, endDateExclusive);

        annualSalary = monthlySalary * 12;

        if(annualSalary>500000){
            taxAmount = (annualSalary * 20)/100;
        } else if(annualSalary>400000 && annualSalary<=500000){
            taxAmount = (annualSalary * 15)/100;
        }else if(annualSalary>300000 && annualSalary<=400000){
            taxAmount = (annualSalary * 10)/100;
        }else if(annualSalary>200000 && annualSalary<=300000){
            taxAmount = (annualSalary * 5)/100;
        }else {
            taxAmount = 0f;
        }

        System.out.println("**************************");
        System.out.println("Name of employee is: " + employeeName);
        System.out.println("Age is: " + age.getYears());
        System.out.println("Annual salary is: " + annualSalary);
        System.out.println("Tax amount is: " + taxAmount);
        System.out.println("**************************");
    }

}
