package com.rana.linkedList;
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
