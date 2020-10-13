package com.firstjava;

import com.firstjava.assignments.day4.Avenger;

public class Main {

    public static void main(String[] args) {

        Avenger[] avengers = new Avenger[5];

        // create object, get details and display
        for(int i=0;i<5;i++)
        {
            avengers[i]=new Avenger();
            avengers[i].getDetails();
            avengers[i].displayDetails();
        }

    }
}
