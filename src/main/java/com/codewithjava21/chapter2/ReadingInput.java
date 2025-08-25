package com.codewithjava21.chapter2;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        System.out.print("Enter a number from 31 to 256: ");
        Scanner inputScanner = new Scanner(System.in);
        String inputString = inputScanner.nextLine();
        inputScanner.close();

        int number = Integer.parseInt(inputString);
        System.out.printf("Symbol for ASCII code %d - is %c", number, (char) number);
    }
}
