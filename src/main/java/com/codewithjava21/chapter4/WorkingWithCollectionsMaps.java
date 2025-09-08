package com.codewithjava21.chapter4;

import java.util.*;

public class WorkingWithCollectionsMaps {
    public static void main(String[] args) {
//        Map<String, String> spellBook = new HashMap<>();
//        Hashtable support interaction with multiple threads
//        Map<String, String> spellBook = new Hashtable<>();
//        LinkedHashMap support the order that they were added
//        Map<String, String> spellBook = new LinkedHashMap<>();
//        TreeMap map has been sorted by the keys in alpha-numeric order
        RPGSimulation.fillSpellBook();

        // A HashMap
//        printMap(spellBook);
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
