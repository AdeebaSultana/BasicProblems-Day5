package com.functionalprograms;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first number : ");
        int valueOne = scanner.nextInt();
        System.out.print("Please enter second number : ");
        int valueTwo = scanner.nextInt();
        double distance, sum;

        sum = ((valueOne*valueOne) + (valueTwo * valueTwo));
        distance = Math.sqrt(sum);
        System.out.println("The Euclidean distance is : " + " " + distance);
    }
}