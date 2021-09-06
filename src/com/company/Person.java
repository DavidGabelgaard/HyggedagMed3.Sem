package com.company;

import java.util.Random;
import java.util.Scanner;

public class Person {

    Random random = new Random();

    int Age = random.nextInt(50) + 1;

    String Name;

    public void inputData() {
        // write your code here
        Scanner data_person = new Scanner(System.in);

        System.out.println("Input name");
        Name = data_person.next();



    }

    public void ageCheck (int Age) {
        if (Age >= 18) {
            System.out.println("Hello " + Name + ", I can see that you are " + Age + " years old");
        } else {
            System.out.println("You are not old enough sorry"); }
    }
}
