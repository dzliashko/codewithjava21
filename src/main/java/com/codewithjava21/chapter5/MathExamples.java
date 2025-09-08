package com.codewithjava21.chapter5;

public class MathExamples {
    public static void main(String[] args) {
        int intNumA = 6;
        int intNumB = 3;
        System.out.printf("%d + %d = %d%n", intNumA, intNumB, add(intNumA, intNumB));
        System.out.printf("%d - %d = %d%n", intNumA, intNumB, subtract(intNumA, intNumB));
        System.out.printf("%d * %d = %d%n", intNumA, intNumB, multiply(intNumA, intNumB));
        System.out.printf("%d / %d = %d%n", intNumA, intNumB, divide(intNumA, intNumB));
        System.out.printf("%d modulo %d = %d%n", intNumA, intNumB, modulo(intNumA, intNumB));
        System.out.printf("%d pow %d = %d%n", intNumA, intNumB, exponent(intNumA, intNumB));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int modulo(int a, int b) {
        return a % b;
    }

    public static int exponent(int a, int b) {
        return (int) Math.pow(a, b);
    }
}
