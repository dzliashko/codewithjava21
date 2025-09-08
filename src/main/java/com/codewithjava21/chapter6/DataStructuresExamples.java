package com.codewithjava21.chapter6;

public class DataStructuresExamples {
    public static void main(String[] args) {
        playWithStack();
    }

    private static void playWithStack() {
        Stack stack = new Stack();

        Item martian = new Item("The Martian");
        Item patriotGames = new Item("Patriot Games");
        Item bladerunner = new Item("Blade Runner");
        Item bladerunner2049 = new Item("Blade Runner 2049");
        Item apollo13 = new Item("Apollo 13");
        Item firstMan = new Item("First Man");
        Item empireStrikesBack = new Item("The Empire Strikes Back");
        Item rogueOne = new Item("Rogue One");
        Item alexander = new Item("Alexander");
        Item starwars = new Item("Star Wars");
        Item runningMan = new Item("Running Man");

        System.out.println("Stack example:");

        stack.push(firstMan);
        stack.push(apollo13);
        stack.push(rogueOne);
        stack.push(empireStrikesBack);
        stack.push(bladerunner2049);
        stack.push(bladerunner);

        System.out.println(stack);

        System.out.printf("%s was extracted\n", stack.pop().getName());

        stack.push(patriotGames);
        stack.push(martian);
        stack.push(alexander);
        stack.push(runningMan);

        System.out.printf("%s was extracted\n", stack.pop().getName());

        stack.push(starwars);

        System.out.println(stack);
    }
}
