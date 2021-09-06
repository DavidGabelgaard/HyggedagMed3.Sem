package com.company;


import java.util.Scanner;

public class Spitball_Java {


    public static Boolean runthatbitch = true;
    public static String input;
    public static double TotalNumbersAddet = 0;
    public static int TimeThruLoop;



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Hej med dig!");

        System.out.println("Input a number:");


        while (runthatbitch) {
            //try catches errors

            try {
                input = scanner.next();
                if (input.equals("q") || input.equals("Q")) {
                    System.out.println("Have a sort of nice day");
                    runthatbitch = false;
                } else {
                    try {
                        TotalNumbersAddet += Double.parseDouble(input);
                        TimeThruLoop++;
                        if (TimeThruLoop != 1) {
                            System.out.println("The average is " + TotalNumbersAddet / TimeThruLoop);
                        }

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
