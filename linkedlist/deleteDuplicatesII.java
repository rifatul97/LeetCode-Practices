package linkedlist;

import java.util.List;

public class deleteDuplicatesII {

    public static ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode fast = head;
        ListNode slow = new ListNode(Integer.MIN_VALUE);
        ListNode ans = slow;

        // 1->2->3->3->4->4->5
        while(fast != null ){

            while(fast.next != null && fast.val == fast.next.val){
                fast = fast.next;
            }

            if(fast != null){
                slow.next = new ListNode(fast.val);
                slow = slow.next;
                fast = fast.next;
            }

        }

        return ans.next;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(0);
        ListNode head = l;
        int[] lvals = {1, 1, 2, 3};
        for(int val : lvals){
            l.next = new ListNode(val);
            l = l.next;
        }
        l.next = null;
        ListNode check = deleteDuplicates(head.next);
        while(check != null) {
            System.out.print(check.val + " ");
            check = check.next;
        }

    }

}
