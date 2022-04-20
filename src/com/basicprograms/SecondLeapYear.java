package com.basicprograms;

import java.util.Scanner;

public class SecondLeapYear {
    public static void main(String[] args)
    {
        System.out.print("Please enter 4 digit number only : ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
            System.out.println(year + " year is not a leap year !!!! ");
        } else {
            System.out.println(year + " is a leap year ... ");
        }

    }
}
