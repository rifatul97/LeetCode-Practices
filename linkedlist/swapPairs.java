package linkedlist;

public class swapPairs {
    public static ListNode swapPairs(ListNode head) {

        boolean turn  =  true;
        ListNode ans = head;
        while (head.next != null) {
            if(turn){
                ListNode second = new ListNode(head.next.val);
                head.next.val = head.val;
                head.val = second.val;
            }
            turn =! turn;
            head = head.next;
        }

        return ans;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(0);
        ListNode head = l;
        int[] lvals = {1, 2, 3, 4, 5};
        for (int val : lvals) {
            l.next = new ListNode(val);
            l = l.next;
        }
        l.next = null;
        ListNode check = swapPairs(head.next);
        while (check != null) {
            System.out.print(check.val + " ");
            check = check.next;
        }

    }
}
