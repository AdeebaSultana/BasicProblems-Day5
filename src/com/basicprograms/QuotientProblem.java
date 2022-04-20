package com.basicprograms;

import java.util.Scanner;

public class QuotientProblem {
    public static void main(String[] args)
    {
        System.out.print("Please enter two number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int quotient = a / b;
        System.out.println("Quotient is :  " + quotient);
        int remainder = a % b;
        System.out.println("Remainder is :  " + remainder);
    }
}