package com.rana.linkedList;

import java.util.HashMap;
import java.util.HashSet;

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

    public Node mergeTwoLists(Node list1, Node list2){
        /**
         *
         int size1 = getSize(list1);// iterative way to solve
        int size2 = getSize(list2);
        //int size = size1+size2;

        int i = 0, j = 0;

        Node head = new Node(0);
        Node handler = head;

        while (i < size1 && j < size2){
            if (list1.val <= list2.val){
                handler.next = list1;
                list1 = list1.next;
                i++;
            } else {
                handler.next = list2;
                list2 = list2.next;
                j++;
            }
            handler = handler.next;
        }
        if (i < size1){
            handler.next = list1;
        }
        else if (j < size2){
            handler.next = list2;
        }
        return head.next;
        */

        if (list1 == null) return list2;//recursive approach to solve the question
        if (list2 == null) return list1;

        Node head;

        if (list1.val < list2.val){
            head = list1;
            head.next = mergeTwoLists(list1.next, list2);
        } else {
            head = list2;
            head.next = mergeTwoLists(list1, list2.next);
        }

        return head;

    }

    public int getSize(Node head){
        if (head == null)
            return 0;

        Node temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
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

    Node copyRandomList1(Node head) { //https://leetcode.com/problems/copy-list-with-random-pointer/
        HashMap<Node, Node> map = new HashMap<>();
        Node curr = head;
        Node dummy = new Node(0);
        Node handler = dummy;

        //initial iteration
        while (curr != null){
            Node node = new Node(curr.val);
            handler.next = node;
            map.put(curr, node);
            handler = handler.next;
            curr = curr.next;
        }

        //set starting point in both the lists
        curr = head;
        handler = dummy.next;

        //setting the random pointer
        /**
        while (curr != null){ //this code snippet is also important, remove the comments for execution on LeetCode
            if (curr.random != null)
                handler.random = map.get(curr.random);
            handler = handler.next;
            curr = curr.next;
        }
        return dummy.next;
         */
        return dummy.next;

    }

    Node copyRandomList(Node head) { //https://leetcode.com/problems/copy-list-with-random-pointer/
        Node cur = duplicate(head);
        //setting random pointers of new nodes
        while (cur != null){
            if (cur.next != null){
                cur.next.random = (cur.random != null) ? cur.random.next : null;
            }
            cur = cur.next.next;
        }

        Node orig = head, copy = head.next, temp = copy;
        //separating both the lists
        while (orig != null){
            orig.next = orig.next.next;
            copy.next = orig.next.next;
            orig = orig.next;
            copy = copy.next;
        }
        return temp;
    }

    //inserting new node in between
    Node duplicate(Node head){
        Node cur = head;

        while (cur != null){
            Node temp = cur.next;
            cur.next = new Node(cur.val);
            cur.next.next = temp;
            cur = temp;
        }
        cur = head;
        return cur;
    }

    private class Node{
        private int val;
        private Node next;
        private Node random;

        public Node(int val) {
            this.val = val;
            this.random = null;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
