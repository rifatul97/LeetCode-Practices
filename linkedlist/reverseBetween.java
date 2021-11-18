package linkedlist;

import java.util.List;

public class reverseBetween {

    public static ListNode reverseBetween(ListNode head, int m, int n) {

        ListNode mthhead = new ListNode(0);
        ListNode ans = mthhead;
        mthhead.next = head;
        // 1->2->3m->(4)->5->6->7->(8)->9n->null
        for (int j = 0; j < m - 1; j++) {
            head = head.next;
            mthhead = mthhead.next;
        }

        for(int i=0; i<n-m; i++){
            head = head.next;
        }

        ListNode prev = head.next;
        ListNode rev = mthhead.next;

        for(int i=0; i<=n-m; i++){
            ListNode next = rev.next;
            rev.next = prev;
            prev = rev;
            rev = next;
        }

        mthhead.next = prev;



        return ans.next;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(0);
        ListNode head = l;
        int[] lvals = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int val : lvals) {
            l.next = new ListNode(val);
            l = l.next;
        }
        l.next = null;
        ListNode check = reverseBetween(head.next, 7, 9);
        while (check != null) {
            System.out.print(check.val + " ");
            check = check.next;
        }

    }

}