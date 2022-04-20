package com.basicprograms;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args)
    {
        System.out.print("Please enter a number : ");
        Scanner sc = new Scanner(System.in);
        System.out.println(evenOdd(sc.nextInt()));
    }

    public static String evenOdd(int number) {
        return number % 2 == 0 ? "Given number is Even !!!!" : "Given number is Odd !!!!";
    }
}