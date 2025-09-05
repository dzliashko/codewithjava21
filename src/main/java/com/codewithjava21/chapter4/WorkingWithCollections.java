package com.codewithjava21.chapter4;

import java.util.Collection;

public class WorkingWithCollections {
    public static void main(String[] args) {
        String[] heroes = {"Byorki", "K'lar", "Tyrenni",
                "Athena", "Jarrod"};
    }

    private static void printCollection(Collection collection) {
        for (Object element : collection) {
            System.out.printf("%s ", element.toString());
            System.out.println();
        }
    }
}
