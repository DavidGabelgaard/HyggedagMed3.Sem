package com.company;


import java.util.Scanner;

public class Spitball_Java {


    public static String input;
    public static double TotalNumbersAddet = 0;
    public static int TimeThruLoop;



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Hej med dig!");

        System.out.println("Input a number:");


        while (true) {
            //try catches errors
            try {
                input = scanner.next();
                //if the input is a q then shot down the program
                if (input.equals("q") || input.equals("Q")) {
                    System.out.println("Have a sort of nice day");
                    break;
                } else {
                    try {
                        // add the numbers together
                        TotalNumbersAddet += Double.parseDouble(input);
                        // a counter of how many times the while loop has run
                        TimeThruLoop++;
                        //only show the average when 2 numbers have been put in as a minimum
                        if (TimeThruLoop > 1) {
                            System.out.println("The average is " + TotalNumbersAddet / TimeThruLoop);
                        }
                    // the rey / catch message if the input is not numeric or a q
                    } catch (NumberFormatException e) {
                        System.out.println("You can only input numbers or \"q/Q\" to stop the program");
                    }

                    System.out.println("Input another number:");
                }
            } catch (Exception e) {
                System.out.println("Not a valid Input");
            }

        }
    }

}
