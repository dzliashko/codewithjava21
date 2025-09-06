package com.codewithjava21.chapter4;

import java.util.Map;
import java.util.Set;

public class WorkingWithCollectionsMaps {
    public static void main(String[] args) {


    }

    private static void printMap(Map map) {
        System.out.println();
        Set<Object> keys = map.keySet();

        for (Object key : keys) {
            System.out.printf("%s: %s\n", key, map.get(key));
        }
    }

    private static void printkeys(Map map) {
        System.out.println();
        Set<Object> keys = map.keySet();

        for (Object key : keys) {
            System.out.printf("%s\n", key);
        }
        System.out.println();
    }
}
