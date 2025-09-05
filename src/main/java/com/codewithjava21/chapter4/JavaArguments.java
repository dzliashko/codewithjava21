package com.codewithjava21.chapter4;

public class JavaArguments {
    public static void main(String[] args) {
        System.out.printf("You gave %d argument(s):\n", args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.printf("args[%d] = %s\n", i, args[i]);
        }
    }
}
