package com.firstjava;

import com.firstjava.assignments.day2.Employee;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.name="Saurab";
        employee1.age=23;
        employee1.city="chennai";

        employee1.getDetails();

    }

}
