package linkedlist;

public class detectCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;
        boolean x = false;

        while(fast != null || fast.next != null) {
            if(x){
                slow = slow.next;
            }
            x =! x;
            fast = fast.next;

            if(slow == fast){
                return slow;
            }
        }

        return null;
    }
}
