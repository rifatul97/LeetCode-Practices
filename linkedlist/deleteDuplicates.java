package linkedlist;

//Definition for singly-linked list.

import java.util.List;

public class deleteDuplicates {

    public static ListNode deleteDuplicates(ListNode head) {

        if( head == null || head.next == null){
            return head;
        }

        ListNode curr = head;
        ListNode ans = curr;

        // 1->2->2->3->3->3->4->5->5->null
        while(head != null) {
            if(curr.val != head.val ){
                curr.next = head;
                curr = curr.next;
            }
            head = head.next;
        }
        curr.next = null;

        return ans;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(0);
        l.next = new ListNode(0);
        l.next.next = new ListNode(0);
        l.next.next.next = new ListNode(0);
        l.next.next.next.next = new ListNode(0);
        l.next.next.next.next.next = new ListNode(0);
        l.next.next.next.next.next.next = new ListNode(0);
        l.next.next.next.next.next.next.next = new ListNode(1);
        l.next.next.next.next.next.next.next.next = new ListNode(2);
        l.next.next.next.next.next.next.next.next.next = null;
        ListNode check = deleteDuplicates(l);
        while(check != null) {
            System.out.print(check.val + " ");
            check = check.next;
        }

    }
}

