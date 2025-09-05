package com.codewithjava21.chapter4;

import java.util.*;

public class WorkingWithCollections {
    public static void main(String[] args) {
        String[] heroes = {"Byorki", "K'lar", "Tyrenni",
                "Athena", "Jarrod"};

//        Set<String> heroesSet = new HashSet<>();
//        Set<String> heroesSet = new LinkedHashSet<>();
        Set<String> heroesSet = new TreeSet<>();
        Collections.addAll(heroesSet, heroes);
        printCollection(heroesSet);
        heroesSet.add("Byorki");
        printCollection(heroesSet);
//      in HashSet not support order of elements
//      in LinkedHashSet support order of elements
//      in TreeSet support alphanumerical order of elements
        heroesSet.add("Rik");
        printCollection(heroesSet);
        heroesSet.remove("Rik");
        printCollection(heroesSet);
    }

    private static void printCollection(Collection collection) {
        for (Object element : collection) {
            System.out.printf("%s ", element.toString());
            System.out.println();
        }
        System.out.println("--------");
    }
}
