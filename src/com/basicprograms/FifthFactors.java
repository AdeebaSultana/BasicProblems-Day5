package com.basicprograms;

import java.util.Scanner;

public class FifthFactors {
    public static void main(String[] args)
    {
        System.out.println("Please enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for(int i = 2; i < number; i++) {
            while(number % i == 0) {
                System.out.println(i + " ");
                number /= i;
            }
        }

        if (number >= 2) {
            System.out.println(number);
        }
    }
}