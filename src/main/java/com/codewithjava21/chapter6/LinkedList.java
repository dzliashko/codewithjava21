package com.codewithjava21.chapter6;

public class LinkedList {
    private Item head;
    private Item tail;
    private int listCount = 0;

    public LinkedList() {
    }

    public LinkedList(Item item) {
        addItem(item);
    }

    private void setWithOneItem(Item item) {
        head = item;
        tail = item;
    }

    public void addItem(Item item) {
        if (listCount == 0) {
            setWithOneItem(item);
        } else {
            item.setNextItem(head);
            head.setPrevItem(item);
            head = item;
        }
        listCount++;
    }

    public void addItemAtBack(Item newItem) {
        if (listCount == 0) {
            setWithOneItem(newItem);
        } else {
            newItem.setPrevItem(tail);
            tail.setNextItem(newItem);
            tail = newItem;
        }
    }

    public Item findItemByName(String name) {
        Item currentItem = head;
        while (currentItem != null) {
            if (currentItem.getName().equals(name)) {
                return currentItem;
            }
            currentItem = currentItem.getNextItem();
        }
        return null;
    }

    public boolean removeItemByName(String name) {
        Item itemFound = findItemByName(name);

        if (itemFound != null) {
            Item previous = itemFound.getPrevItem();
            Item next = itemFound.getNextItem();
            previous.setNextItem(next);
            next.setPrevItem(previous);
            listCount--;
            return true;
        }
        return false;
    }

    public Item getHead() {
        return head;
    }

    public Item getTail() {
        return tail;
    }

    public int getListCount() {
        return this.listCount;
    }

    public String toString() {
        StringBuilder returnVal = new StringBuilder("\n");
        Item item = head;
        while (item != null) {
            returnVal.append(item.getName());
            returnVal.append("\n");
            item = item.getNextItem();
        }
        return returnVal.toString();
    }
}
