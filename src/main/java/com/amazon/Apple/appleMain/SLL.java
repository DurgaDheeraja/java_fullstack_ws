package com.amazon.Apple.appleMain;

class LinkedList {
    Node head; // head of list

    /* Linked list Node*/
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        // Next is by default initialized
        // as null
        Node(int d) { data = d; }
    }
}