package com.codewithjava21.chapter6;

public class DataStructuresExamples {
    static Item martian = new Item("The Martian");
    static Item patriotGames = new Item("Patriot Games");
    static Item bladeRunner = new Item("Blade Runner");
    static Item bladeRunner2049 = new Item("Blade Runner 2049");
    static Item apollo13 = new Item("Apollo 13");
    static Item firstMan = new Item("First Man");
    static Item empireStrikesBack = new Item("The Empire Strikes Back");
    static Item rogueOne = new Item("Rogue One");
    static Item alexander = new Item("Alexander");
    static Item starWars = new Item("Star Wars");
    static Item runningMan = new Item("Running Man");

    public static void main(String[] args) {
//        playWithStack();
        playWithSQueue();
    }

    private static void playWithStack() {
        Stack stack = new Stack();

        System.out.println("Stack example:");

        stack.push(firstMan);
        stack.push(apollo13);
        stack.push(rogueOne);
        stack.push(empireStrikesBack);
        stack.push(bladeRunner2049);
        stack.push(bladeRunner);

        System.out.println(stack);

        System.out.printf("%s was extracted\n", stack.pop().getName());

        stack.push(patriotGames);
        stack.push(martian);
        stack.push(alexander);
        stack.push(runningMan);

        System.out.printf("%s was extracted\n", stack.pop().getName());

        stack.push(starWars);

        System.out.println(stack);
    }

    private static void playWithSQueue() {
        System.out.println("Queue example:");
        Queue queue = new Queue();

        queue.enqueue(starWars);
        queue.enqueue(bladeRunner);
        queue.enqueue(empireStrikesBack);
        queue.enqueue(patriotGames);
        queue.enqueue(bladeRunner2049);
        System.out.println(queue);

        System.out.println(queue.dequeue().getName() + " was dequeued.");
        System.out.println(queue.dequeue().getName() + " was dequeued.");
        System.out.println(queue);
    }
}

