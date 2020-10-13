package com.firstjava.assignments.day4;

import java.util.Scanner;

/*
Questions 1:
create a class avenger with
properties (name,age,power,weapon,planet) and with
functions-getDetails() and displayDetails().
create 5 objects as an array in the main method and call.
*/
public class Avenger {

    Scanner scanner = new Scanner(System.in);
    public String name, power, weapon, planet;
    public int age;

    public void getDetails(){
        System.out.print("Enter name as String : ");
        name = scanner.nextLine();
        System.out.print("Enter power as String: ");
        power = scanner.nextLine();
        System.out.print("Enter weapon as String: ");
        weapon = scanner.nextLine();
        System.out.print("Enter Planet as String: ");
        planet = scanner.nextLine();
        System.out.print("Enter age as Integer: ");
        age = scanner.nextInt();
    }

    public void displayDetails(){
        System.out.println("*************");
        System.out.println("Name is: " + name + "\n" +
                "Power is: " + power + "\n" +
                "Weapon is: " + weapon + "\n" +
                "Planet is: " + planet + "\n" +
                "Age is: " + age
        );
        System.out.println("*************");
    }
}
