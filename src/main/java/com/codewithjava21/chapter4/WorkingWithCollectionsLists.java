package com.codewithjava21.chapter4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class WorkingWithCollectionsLists {
    public static void main(String[] args) {
        //        Working with Lists
        //        just ArrayList
        List<String> monsterList = new ArrayList<>();
        //        Vector same as ArrayList but thread-safe
        //        List<String> monsterList = new Vector<>();
        monsterList.add("Kobald");
        monsterList.add("Skeleton");
        monsterList.add("Zombie");
        monsterList.add("Rats");
        monsterList.add("Skeleton");

        //        in ArrayList and Vector
        //        printCollection(monsterList);
        //        monsterList.remove("Skeleton");
        //        monsterList.remove(2);
        //        printCollection(monsterList);
        //        System.out.println(monsterList.get(1));

        //        LinkedList support order of elements
        LinkedList<String> cityList = new LinkedList<>();
        cityList.add("Elddim");
        cityList.add("Crystwind");
        cityList.add("Fallraen");
        cityList.add("Meren");
        cityList.add("Lang");
        printCollection(cityList);
        System.out.println(cityList.get(3));
        cityList.remove(3);
        printCollection(cityList);
        System.out.println(cityList.peek());
        System.out.println(cityList.getFirst());
        System.out.println(cityList.peekLast());
        System.out.println(cityList.getLast());
        System.out.println(cityList.poll());
        System.out.println(cityList.pollLast());
        printCollection(cityList);
    }

    private static void printCollection(Collection collection) {
        for (Object element : collection) {
            System.out.printf("%s ", element.toString());
        }
        System.out.println();
    }
}
