package com.basicprograms;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args)
    {
        System.out.print("Please enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Before swapping : a = " + a + " b = " + b);
        System.out.println("After swapping : a = " + b + " b = " + a);
    }
}
