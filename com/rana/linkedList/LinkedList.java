package com.rana.linkedList;

public class LinkedList {

    private Node head;
    private Node tail;

    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node n = new Node(val);
        n.next = head;
        head = n;

        if (tail == null)
            tail = head;

        size += 1;
    }

    public void insertLast(int val){
        if (tail == null){
            insertFirst(val);
            return;
        }

        Node n = new Node(val);
        tail.next = n;
        tail = n;
        size++;
    }

    public void insert(int val, int index){
        if (index == 0){
            insertFirst(val);
            return;
        }
        if (index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {//'0' is temp itself
            temp = temp.next;
        }

        Node n = new Node(val, temp.next);
        temp.next = n;

        size++;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + "-> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
