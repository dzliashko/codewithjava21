package com.codewithjava21.chapter6;

public class Stack {
    private Item[] items;
    private int maxCount;
    private int stackCount = 0;

    public Stack() {
        this(10);
    }

    public Stack(int numItems) {
        maxCount = numItems;
        items = new Item[maxCount];
    }

    private void resizeItemsArray() {
        maxCount = maxCount + 5;
        Item[] newArray = new Item[maxCount];

        for (int counter = 0; counter < stackCount; counter++) {
            newArray[counter] = items[counter];
        }
        items = newArray;
    }

    public void push(Item item) {
        if (stackCount + 1 >= maxCount) {
            resizeItemsArray();
        }
        stackCount++;
        items[stackCount - 1] = item;
    }

    public Item peek() {
        return items[stackCount - 1];
    }

    public Item pop() {
        Item returnItem = peek();
        stackCount--;
        return returnItem;
    }

    public int getStackCount() {
        return stackCount;
    }

    @Override
    public String toString() {
        StringBuilder returnVal = new StringBuilder("\n");
        for (int counter = stackCount - 1; counter >= 0; counter--) {
            returnVal.append(counter);
            returnVal.append(" - ");
            returnVal.append(items[counter].getName());
            returnVal.append("\n");
        }
        return returnVal.toString();
    }
}
