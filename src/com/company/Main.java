package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        double d1 = getaDouble(sc, "Enter numeric value 1: ");

        double d2 = getaDouble(sc, "Enter numeric value 2: ");

        double result = d1 / d2;

        System.out.println("The answer is " + result);
    }

    private static double getaDouble(Scanner sc, String prompt) {
        System.out.print(prompt);
        var d1 = sc.nextDouble();
        return d1;
    }

}

