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
//        playWithQueue();
//        playWithLinkedList();
        playWithTree();
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

    private static void playWithQueue() {
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

    private static void playWithLinkedList() {
        System.out.println("LinkedList example:");
        LinkedList linkedList = new LinkedList();

        Item elddim = new Item("Elddim");
        Item crystwind = new Item("Crystwind");
        Item fallraen = new Item("Fallraen");
        Item meren = new Item("Meren");
        Item lang = new Item("Lang");
        Item hiroth = new Item("Hiroth");
        linkedList.addItem(lang);
        linkedList.addItem(meren);
        linkedList.addItem(fallraen);
        linkedList.addItem(crystwind);
        linkedList.addItem(elddim);
        System.out.println(linkedList);


        System.out.println("Does the list contain " + crystwind.getName() + "?");
        if (linkedList.findItemByName(crystwind.getName()) != null) {
            System.out.println("Yes!");
        } else {
            System.out.println("No, not found.");
        }


        System.out.println("Does the list contain " + hiroth.getName() + "?");
        if (linkedList.findItemByName(hiroth.getName()) != null) {
            System.out.println("Yes!");
        } else {
            System.out.println("No, not found.");
        }

        System.out.println("Now remove " + meren.getName());
        linkedList.removeItemByName(meren.getName());
        System.out.println(linkedList);
    }

    private static void playWithTree() {
        System.out.println("Tree example:");
        Tree tree = new Tree(47);
        tree.insert(48);
        tree.insert(20);
        tree.insert(15);
        tree.insert(26);
        tree.insert(18);

        tree.traverseFromRoot();
        System.out.println();
        tree.reverseFromRoot();
    }
}

