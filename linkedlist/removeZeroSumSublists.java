package linkedlist;

import java.util.HashMap;

public class removeZeroSumSublists {
    public ListNode removeZeroSumSublists(ListNode head) {

        ListNode ans = head;

        int sum = 0;

        while(head != null){
            sum += head.val;
            head = head.next;

            if(sum == 0){

            }
        }

        return null;
    }
}
