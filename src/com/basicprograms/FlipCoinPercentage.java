package com.basicprograms;

import java.util.Random;

class Toss {
    public String chanceFunc() {
        Random random = new Random();
        int limit = random.nextInt(2);
        if (limit < 0.5) {
            return"tails";
        } else {
            return"heads";
        }
    }
}
public class FlipCoinPercentage {
    public static void main(String[] args)
    {
        Toss toss = new Toss();
        int heads = 0;
        int tails = 0;
        int chances = 10;

        for (int i = 1; i<= chances; i++) {
            if (toss.chanceFunc().equals("tails")) {
                tails++;
            } else {
                heads++;
            }
        }
        System.out.println("Chances = " + chances);
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
    }
}