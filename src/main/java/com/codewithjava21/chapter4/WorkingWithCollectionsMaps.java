package com.codewithjava21.chapter4;

import java.util.*;

public class WorkingWithCollectionsMaps {
    public static void main(String[] args) {
//        Map<String, String> spellBook = new HashMap<>();
//        Hashtable support interaction with multiple threads
//        Map<String, String> spellBook = new Hashtable<>();
//        LinkedHashMap support the order that they were added
        Map<String, String> spellBook = new LinkedHashMap<>();
        spellBook.put("Fireball", "A ball of fire that inflicts 8 damage per level of magic.");
        spellBook.put("Healing Touch", "Touching an injured player recovers 5 hit points per character level.");
        spellBook.put("Lightning Bolt", "A stream of lightning that inflicts 10 damage per level of magic.");
        spellBook.put("Create Water", "Creates 10 liters of water per level of magic.");
        spellBook.put("Transmutation", "Converts common items into gold.");

        // A HashMap
        printMap(spellBook);
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
