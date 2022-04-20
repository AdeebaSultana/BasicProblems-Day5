package com.basicprograms;

import java.util.Scanner;

public class OvelConsonent{
    public static void main(String[] args)
    {
        System.out.println("Please enter an alphabet : ");
        Scanner scanner = new Scanner(System.in);
        String character = scanner.next();

        switch(character) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(character + " is a vowel .....");
                break;
            default:
                System.out.println(character + " is a consonant .....");
        }
    }
}