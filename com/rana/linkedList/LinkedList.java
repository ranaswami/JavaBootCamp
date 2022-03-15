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

    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if (size <= 1){
            deleteFirst();
        }
        int val = tail.val;
        Node secondLast = get(size-2);
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int deleteIndex(int index){
        if (index == 0){
            return deleteFirst();
        }
        else if (index == size-1){
            return deleteLast();
        }
        else {
            Node prev = get(index-1);
            int val = prev.next.val;
            prev.next = prev.next.next;
            return val;
        }
    }

    public Node find(int val){//to find a particular node with a value
        Node node = head;
        while (node != null){
            if (node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }


    public Node get(int index){//to get the node at a particular index
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + "-> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public Node reverseList(Node head){// recursive way to reverse a linked list
        if (head == null || head.next == null){
            return head;
        }
        Node newHead = reverseList(head.next);
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;
        return newHead;
    }

    public Node reverseList1(Node head){// iterative way to reverse a linked list
        if(head == null || head.next == null){
            return head;
        }
        Node cur = head;
        Node prev = null;
        while(cur != null){
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
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
