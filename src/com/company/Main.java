package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int totalAge = 0;

        Person nameData = new Person();


        ArrayList<Person> person = new ArrayList<>();

        //Input the data using scanner
        nameData.inputData();
        //Check the age and make an output message based on the age
        nameData.ageCheck(nameData.Age);

        for (int i = 0; i < 10 ; i++) {
            person.add(new Person());
            totalAge += person.get(i).Age;
            System.out.println(person.get(i).Age);
        }
        int average = totalAge / 10;

        System.out.println("The average is: " + average);


    }






}
