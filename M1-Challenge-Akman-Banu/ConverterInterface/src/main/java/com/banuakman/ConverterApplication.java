package com.banuakman;

import java.util.Scanner;

public class ConverterApplication {
    public static void main(String[] args) {

        System.out.println("\u001b[32;1m");
        System.out.println("Welcome to Day & Month Converter !");
        System.out.println("---------------------------------------------");

        int day = userInput(7);
        int month = userInput(12);

        ConverterIf converterIf = new ConverterIf();
        ConverterSwitch converterSwitch = new ConverterSwitch();

        System.out.println("---------------------------------------------");
        System.out.println("Conversion by using ConverterIf:");
        System.out.println("---------------------------------------------");
        System.out.println("The day you enter (" + day +  ") is " + converterIf.convertDay(day));
        System.out.println("The month you enter (" + month + ") is " + converterIf.convertMonth(month));
        System.out.println(" ");
        System.out.println("---------------------------------------------");
        System.out.println("Conversion by using ConverterSwitch:");
        System.out.println("---------------------------------------------");
        System.out.println("The day you have selected is " + converterSwitch.convertDay(day));
        System.out.println("The month you have selected is " + converterSwitch.convertMonth(month));

    }

    public static int userInput(int maxNum) {
        Scanner scanner = new Scanner(System.in);

        int userInput = 0;

        do {
            System.out.println("Please enter a number between 1 and " + maxNum);
            try {
                userInput = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("This is not a number, try again...");
            }
        } while (userInput < 1 || userInput > maxNum);

        return userInput;
    }
}
