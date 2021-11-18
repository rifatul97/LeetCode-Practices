package linkedlist;

public class reverseList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(0);
        ListNode head = l;
        int[] lvals = {1, 1, 2, 3};
        for (int val : lvals) {
            l.next = new ListNode(val);
            l = l.next;
        }
        l.next = null;
        ListNode check = reverseList(head.next);
        while (check != null) {
            System.out.print(check.val + " ");
            check = check.next;
        }

    }

}

