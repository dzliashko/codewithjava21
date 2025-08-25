package com.codewithjava21.chapter2;

import java.util.Random;

public class RandomCase {
    public static void main(String[] args) {
        Random random = new Random();
        boolean fourFound = false;
        String result;
        do {
            int number = random.nextInt(5) + 1;
            switch (number) {
                case 1 -> result = "One";
                case 2 -> result = "Two";
                case 3 -> result = "Three";
                case 4 -> {
                    result = "Four";
                    fourFound = true;
                }
                case 5 -> result = "Five";
                default -> result = "Something strange";
            }
            System.out.println(result);
        } while (!fourFound);


    }
}
