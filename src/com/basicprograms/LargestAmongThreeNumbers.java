package com.basicprograms;

import java.util.Scanner;

public class LargestAmongThreeNumbers {
    public static void main(String[] args)
    {
        System.out.println("Please enter 3 number : ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println(firstNumber + " is largest number");
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println(secondNumber + " is largest number");
        } else {
            System.out.println(thirdNumber + " is largest number");
        }
    }
}