package com.codewithjava21.chapter2;

public class HelloWorld {
    private static String firstName = "Dzmitry";
    private static int age = 52;

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.printf("Welcome to the world of Java, %s!\n", firstName);
        System.out.printf("age = %d. It's never to late to learn Java!\n", age);
    }
}
