package com.rana.linkedList;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
//https://leetcode.com/problems/middle-of-the-linked-list/
//https://leetcode.com/problems/palindrome-linked-list/
//https://leetcode.com/problems/sort-list/
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

        ListNode addTwoNumbers1(ListNode l1, ListNode l2) { //https://leetcode.com/problems/add-two-numbers-ii/
            ListNode list1 = reverseList(l1);
            ListNode list2 = reverseList(l2);

            ListNode res = addTwoNumbers(list1, list2);

            ListNode finalRes = reverseList(res);

            return finalRes;
        }

        ListNode deleteDuplicates(ListNode head) { //https://leetcode.com/problems/remove-duplicates-from-sorted-list/
            if (head == null || head.next == null)
                return head;
            ListNode curr = head;
            while (curr.next != null){
                if (curr.next.val == curr.val){
                    curr.next = curr.next.next;
                } else {
                    curr = curr.next;
                }
            }
            return head;

            /**
             * Another approach
            ListNode dummy = new ListNode(Integer.MIN_VALUE);
            dummy.next = head;
            ListNode prev = dummy;
            ListNode curr = head;

            while (curr != null){
                if (curr.val == prev.val){
                    prev.next = curr.next;
                    curr = curr.next;
                } else {
                    prev = curr;
                    curr = curr.next;
                }
            }
            return dummy.next;
             */

        }

        ListNode swapNodes(ListNode head, int k) {

            ListNode slow = head;
            ListNode fast = head;
            ListNode n1 = head;
            //finding n1
            for (int i = 0; i < k-1; i++) {
                fast = fast.next;
                n1 = fast;
            }
            //finding n2 (i.e. slow)
            while (fast.next != null){
                slow = slow.next;
                fast = fast.next;
            }
            int n1_val = n1.val;
            n1.val = slow.val;
            slow.val = n1_val;

            return head;
            /**
            ListNode temp1 = head; //space and time complexity is O(n).
            ListNode temp2 = head;
            ArrayList<Integer> li = new ArrayList<>();
            int count = 0;
            while (temp1 != null){
                li.add(temp1.val);
                count++;
            }
            swap(k-1, count-k, li);
            int i = 0;
            while (i < count){
                temp2.val = li.get(i);
                i++;
                temp2 = temp2.next;
            }
            return head;
             */
        }

        void swap(int first, int second, ArrayList<Integer> li){
            int temp = li.get(first);
            li.set(first, li.get(second));
            li.set(second, temp);
        }

        ListNode oddEvenList(ListNode head) { //https://leetcode.com/problems/odd-even-linked-list/
            if (head == null)
                return null;
            else if (head.next == null)
                return head;
            else {
                ListNode odd = head;
                ListNode even = head.next;
                ListNode evenHead = even;

                while (even != null && even.next != null){
                    odd.next = even.next;
                    odd = odd.next;
                    even.next = odd.next;
                    even = even.next;
                }
                odd.next = evenHead;
                return head;
            }
        }

        ListNode swapPairs(ListNode head) { //https://leetcode.com/problems/swap-nodes-in-pairs/
            return swapAdjacentNodes(head);
        }

        ListNode swapAdjacentNodes(ListNode head){
            if (head == null || head.next == null)
                return head;
            ListNode first = head;
            ListNode second = head.next;

            ListNode tempList = swapAdjacentNodes(second.next);
            first.next = tempList;
            second.next = first;

            return second;
        }

        ListNode sortList(ListNode head) { //https://leetcode.com/problems/sort-list/
            //implementing the concept of merge sort
            if (head == null || head.next == null)
                return head;

            ListNode slow = head, fast = head.next;

            while (fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            //dividing the list into two parts
            fast = slow.next;
            slow.next = null;

            //sort and merge
            ListNode l1 = sortList(head);
            ListNode l2 = sortList(fast);

            return mergeTwoLists(l1, l2);
        }

        ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            /** //recursive approach
            if (list1 == null) return list2;
            if (list2 == null) return list1;

            ListNode head;

            if (list1.val < list2.val){
                head = list1;
                head.next = mergeTwoLists(list1.next, list2);
            } else {
                head = list2;
                head.next = mergeTwoLists(list1, list2.next);
            }

            return head;
            */

            //The below code snippet is the iterative approach to merge two sorted linked list
            ListNode head = new ListNode(0);
            ListNode handler = head;
            //iterative approach
            while (list1 != null && list2 != null){
                if (list1.val <= list2.val){
                    handler.next = list1;
                    list1 = list1.next;
                } else {
                    handler.next = list2;
                    list2 = list2.next;
                }
                handler = handler.next;
            }

            if (list1 != null){
                handler.next = list1;
            } else if (list2 != null){
                handler.next = list2;
            }
            return head.next;
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
