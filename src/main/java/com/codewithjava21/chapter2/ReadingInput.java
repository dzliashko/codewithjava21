package com.codewithjava21.chapter2;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        System.out.print("Enter a number from 31 to 256: ");
        Scanner inputScanner = new Scanner(System.in);
        String inputString = inputScanner.nextLine();
        inputScanner.close();

        try {
            int number = Integer.parseInt(inputString);
            if (number > 31) {
                System.out.printf("Symbol for ASCII code %d - is %c", number, (char) number);
            } else {
                System.out.println("Sorry, only ASCII code 32 and higher is allowed ");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
