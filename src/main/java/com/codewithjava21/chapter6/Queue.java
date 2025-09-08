package com.codewithjava21.chapter6;

public class Queue {
    private Item[] items;
    private int maxCount;
    private int queueCount = 0;

    public Queue() {
        this(10);
    }

    public Queue(int maxCount) {
        this.maxCount = maxCount;
        items = new Item[maxCount];
    }

    private void resizeItemsArray() {
        maxCount += 5;
        Item[] newArray = new Item[maxCount];

        if (queueCount >= 0) {
            System.arraycopy(items, 0, newArray, 0, queueCount);
        }
        items = newArray;
    }

    public Item getFront() {
        if (queueCount > 0) {
            return items[0];
        } else {
            return null;
        }
    }

    public Item getBack() {
        if (queueCount > 0) {
            return items[queueCount - 1];
        } else {
            return null;
        }
    }

    public void enqueue(Item item) {
        if (queueCount + 1 >= maxCount) {
            resizeItemsArray();
        }
        queueCount++;
        items[queueCount - 1] = item;
    }

    public Item dequeue() {
        if (queueCount == 0) {
            return null;
        } else {
            Item returnVal = getFront();
            for (int i = 1; i < queueCount; i++) {
                items[i - 1] = items[i];
            }
            queueCount--;
            return returnVal;
        }
    }

    public int getQueueCount() {
        return queueCount;
    }

    public String toString() {
        StringBuilder returnVal = new StringBuilder("\n");
        for (int counter = 0; counter < queueCount;
             counter++) {
            returnVal.append(counter);
            returnVal.append(" - ");
            returnVal.append(items[counter].getName());
            returnVal.append("\n");
        }
        return returnVal.toString();
    }
}
