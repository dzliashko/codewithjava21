package com.codewithjava21.chapter3;

import java.nio.charset.Charset;
import java.util.Scanner;

public class FunWithCharacterCodes {
    public static void main(String[] args) {
        String strA = "A";
        String strB = "B";
        String strC = "C";

        char upperA = 'A';
        char upperB = 'B';
        char upperC = 'C';

        System.out.println(strA + strA);
        System.out.println(strB);
        System.out.println(strC);

        System.out.println(upperA + upperA);
        System.out.println(upperB);
        System.out.println(upperC);

        System.out.println(Charset.defaultCharset());

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a symbol: ");
        String inputStr = scanner.nextLine();
        char inputChar = inputStr.charAt(0);
        scanner.close();

        if (inputChar >= 'A' && inputChar < 'L') {
            System.out.println("Symbol between A and K");
        } else if (inputChar >= 'L' && inputChar < 'R') {
            System.out.println("Symbol between L and Q");
        } else {
            System.out.println("Symbol between R and Z");
        }

        System.out.println(inputChar + " = " + (int) inputChar);
    }
}
