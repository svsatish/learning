package com.firstjava.demo;

public class Day2 {
    // global/class variable
    public int data;

    /* Access specifier/modifier - public, protected, default, private
    public - has access in all packages/ project
    default - only in package
    private - only in class
     */
    public static void main(String[] args) {
        System.out.println("Print my first Java program");

        // variable - temporary storage location
        // syntax - dataType identifier = value;
        // dataTypes - byte, short, char, int, long, double, float, boolean

        float num = 3567F;
        System.out.println("variable " + num);

        // Object creation
        Day2 objectReference1 = new Day2();
        objectReference1.data = 10;

        Day2 objectReference2 = new Day2();
        objectReference2.data = 20;

        System.out.println(objectReference1.data);
        System.out.println(objectReference2.data);


    }
}
