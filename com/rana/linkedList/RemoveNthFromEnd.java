package com.rana.linkedList;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
//https://leetcode.com/problems/middle-of-the-linked-list/
//https://leetcode.com/problems/palindrome-linked-list/
public class RemoveNthFromEnd {

    public static void main(String[] args) {
        System.out.println("Done");
    }

    private class LinkedList1 {

        private ListNode head;
        private ListNode tail;

        private int size;

        public LinkedList1() {
            this.size = 0;
        }

        ListNode removeNthFromEnd(ListNode head, int n) { //https://leetcode.com/problems/remove-nth-node-from-end-of-list/
            int size = getSize(head);
            if (size <= 1 || size == n){
                return head.next;
            }
            int prevNodeIndex = size - (n+1);
            ListNode prevNode = get(prevNodeIndex, head);
            prevNode.next = prevNode.next.next;
            return head;
        }

        ListNode get(int index, ListNode head){
            ListNode temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }

        int getSize(ListNode head){
            if (head == null)
                return 0;

            ListNode temp = head;
            int count = 0;
            while (temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }

        ListNode middleNode(ListNode head) { //https://leetcode.com/problems/middle-of-the-linked-list/
            int size = getSize(head);
            ListNode temp = head;
            for (int i = 0; i < size/2; i++) {
                temp = temp.next;
            }
            return temp;
        }

        int getDecimalValue(ListNode head) {
            ListNode reverseHead = reverseList(head);
            ListNode temp = reverseHead;
            int sum = 0, i = 0;
            while (temp != null){
                sum += (int) Math.pow(2, i) * temp.val;
                i++;
                temp = temp.next;
            }
            return sum;
        }

        boolean isPalindrome(ListNode head) { //https://leetcode.com/problems/palindrome-linked-list/
            ListNode temp = new ListNode(head.val);
            ListNode newHead = temp;
            ListNode curr = head.next;
            while (curr != null){
                temp.next = new ListNode(curr.val);
                curr = curr.next;
                temp = temp.next;
            }

            newHead = reverseList(newHead);

            while (newHead != null){
                if(newHead.val != head.val){
                    return false;
                }
                //System.out.print(newHead.val);
                newHead = newHead.next;
                head = head.next;
            }
            return true;
        }

        ListNode reverseList(ListNode head){
            ListNode prev = null;
            ListNode curr = head;
            while (curr != null){
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            return prev;
        }

        ListNode getIntersectionNode(ListNode headA, ListNode headB) { //https://leetcode.com/problems/intersection-of-two-linked-lists/
            ListNode temp1 = headA;
            ListNode temp2 = headB;

            int lenA = getSize(temp1);
            int lenB = getSize(temp2);

            while (lenA > lenB){
                temp1 = temp1.next;
                lenA--;
            }

            while (lenA < lenB){
                temp2 = temp2.next;
                lenB--;
            }

            while (temp1 != temp2){
                temp1 = temp1.next;
                temp2 = temp2.next;
                if (temp1 == null){
                    return null;
                }
            }

            return temp1;
        }

        ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
            if (headA == null || headB == null)
                return null;

            ListNode temp1 = headA;
            ListNode temp2 = headB;
            // if temp1 & temp2 have different length, then we will stop after 2nd iteration
            while (temp1 != temp2){
                //after the end of 1st iteration, we just reset the pointer to the head of another linked list
                if (temp1 == null){
                    temp1 = headB;
                } else
                    temp1 = temp1.next;

                if (temp2 == null){
                    temp2 = headA;
                } else
                    temp2 = temp2.next;
            }
            return temp1;
        }

        boolean hasCycle(ListNode head) {
            if (head == null)
                return false;

            //Floyd’s Cycle-Finding Algorithm // fast slow approach // 2 pointers // "tortoise and the hare algorithm"
            ListNode walker = head;
            ListNode runner = head;
            while (runner.next != null && runner.next.next != null){
                walker = walker.next;
                runner = runner.next.next;
                if (walker == runner)
                    return true;
            }
            return false;
        }

        ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode temp1 = l1;
            ListNode temp2 = l2;

            ListNode dummy = new ListNode(0);
            ListNode handler = dummy;

            int carry = 0;

            while (temp1 != null || temp2 != null || carry == 1){
                int sum = 0;
                if (temp1 != null){
                    sum += temp1.val;
                    temp1 = temp1.next;
                }
                if (temp2 != null){
                    sum += temp2.val;
                    temp2 = temp2.next;
                }
                sum += carry;
                carry = sum/10;
                ListNode nextNode = new ListNode(sum % 10);
                handler.next = nextNode;
                handler = handler.next;
            }
            return dummy.next;
        }

        ListNode removeElements(ListNode head, int val) {
            ListNode dummy = new ListNode(0);
            ListNode dummyhead = dummy;
            ListNode node = head;
            while( node != null)
            {
                if(node.val != val)
                {
                    dummy.next = new ListNode(node.val);
                    dummy = dummy.next;
                }

                node = node.next;
            }
            return dummyhead.next;
        }

        void deleteIndex(ListNode head, int index, int size){
            if (index == 0){
                head = head.next;
            }
            else if (index == size-1){
                ListNode tail = get(head, size-1);
                ListNode secondLast = get(head, size-2);
                tail = secondLast;
                tail.next = null;
            }
            else {
                ListNode prev = get(head, index-1);
                prev.next = prev.next.next;
            }
        }

        ListNode get(ListNode head, int index){
            ListNode node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node;
        }


        private class ListNode{
            private int val;
            private ListNode next;

            public ListNode() {
            }

            public ListNode(int val) {
                this.val = val;
            }

            public ListNode(int val, ListNode next) {
                this.val = val;
                this.next = next;
            }
        }
    }
}
