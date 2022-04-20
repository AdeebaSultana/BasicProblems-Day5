package com.basicprograms;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args)
    {
        System.out.println("Please enter a number : ");
        Scanner scanner = new Scanner(System.in);
        double setLimit = scanner.nextDouble();
        double result = 0;

        for(double i = 1; i<= setLimit; i++) {
            result += 1/i;
        }
        System.out.println("Harmonic value is :  " + result);
    }
}
