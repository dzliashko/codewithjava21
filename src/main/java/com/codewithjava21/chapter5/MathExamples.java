package com.codewithjava21.chapter5;

public class MathExamples {
    public static void main(String[] args) {
        int intNumA = 5;
        int intNumB = 3;
        System.out.printf("%d + %d = %d%n", intNumA, intNumB, add(intNumA, intNumB));
        System.out.printf("%d - %d = %d%n", intNumA, intNumB, subtract(intNumA, intNumB));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}
