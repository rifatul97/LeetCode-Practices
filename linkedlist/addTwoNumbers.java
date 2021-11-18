package linkedlist;

import java.util.Stack;

public class addTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<Integer> first = new Stack<Integer>();
        Stack<Integer> second = new Stack<Integer>();
        ListNode ans = null;

        // 7 -> 2 -> 4 -> 3
        while(l1 != null){
            first.push(l1.val);
            l1 = l1.next;
        }

        // 5 -> 6 -> 4
        while (l2 != null){
            second.push(l2.val);
            l2 = l2.next;
        }

        int one = 0;
        int val = one;
        while(!first.empty() || !second.empty()){
            val = one;
            if(!first.empty()){
                val += first.pop();
            }
            if(!second.empty()){
                val += second.pop();
            }
            if(val >= 10){
                one = 1;
            }
            else {
                one = 0;
            }
            ListNode newVal = new ListNode(val%10);
            newVal.next = ans;
            ans = newVal;
        }

        if(one == 1){
            ListNode oneVal = new ListNode(1);
            oneVal.next = ans;
            ans = oneVal;
        }

        return ans;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(0);
        ListNode lhead = l;
        ListNode r = new ListNode(0);
        ListNode rhead = r;
        int[] lvals = {9, 9, 9, 9};
        int[] rvals = {9};
        for (int val : lvals) {
            l.next = new ListNode(val);
            l = l.next;
        }
        for (int val : rvals) {
            r.next = new ListNode(val);
            r = r.next;
        }
        l.next = null;
        ListNode check = addTwoNumbers(lhead.next, rhead.next);
        while (check != null) {
            System.out.print(check.val + " ");
            check = check.next;
        }

    }
}
