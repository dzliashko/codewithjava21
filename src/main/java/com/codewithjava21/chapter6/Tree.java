package com.codewithjava21.chapter6;

public class Tree {
    private Node root;

    public Tree() {
    }

    public Tree(int value) {
        this.root = new Node(value);
    }

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            root.insertNode(value);
        }
    }

    public void traverseFromRoot() {
        traverse(root);
    }

    public void reverseFromRoot() {
        reverse(root);
    }

    private void traverse(Node node) {
        if (node == null) {
            return;
        }
        traverse(node.getPrevious());
        System.out.println(node.getValue());
        traverse(node.getNext());
    }

    private void reverse(Node node) {
        if (node == null) {
            return;
        }
        reverse(node.getNext());
        System.out.println(node.getValue());
        reverse(node.getPrevious());
    }
}
