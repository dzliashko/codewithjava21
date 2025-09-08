package com.codewithjava21.chapter6;

public class DataStructuresExamples {
    static Item martian = new Item("The Martian");
    static Item patriotGames = new Item("Patriot Games");
    static Item bladerunner = new Item("Blade Runner");
    static Item bladerunner2049 = new Item("Blade Runner 2049");
    static Item apollo13 = new Item("Apollo 13");
    static Item firstMan = new Item("First Man");
    static Item empireStrikesBack = new Item("The Empire Strikes Back");
    static Item rogueOne = new Item("Rogue One");
    static Item alexander = new Item("Alexander");
    static Item starwars = new Item("Star Wars");
    static Item runningMan = new Item("Running Man");

    public static void main(String[] args) {
        playWithStack();
    }

    private static void playWithStack() {
        Stack stack = new Stack();

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
