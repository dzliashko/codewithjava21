package com.codewithjava21.chapter6;

public class Node {
    private int value;
    private Node next;
    private Node previous;

    public Node(int value) {
        this.value = value;
    }

    public void insertNode(int newValue) {
        if (newValue < this.value) {
            if (this.previous == null) {
                previous = new Node(newValue);
            } else {
                previous.insertNode(newValue);
            }
        } else if (newValue > this.value) {
            if (this.next == null) {
                next = new Node(newValue);
            } else {
                next.insertNode(newValue);
            }
        }
    }

    public int getValue() {
        return this.value;
    }

    public Node getNext() {
        return this.next;
    }

    public Node getPrevious() {
        return this.previous;
    }
}
