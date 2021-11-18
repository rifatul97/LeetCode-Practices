package linkedlist;

public class partition {
	
	/*Input: head = 1->4->3->2->5->2, x = 3
	  Output: 1->2->2->4->3->5*/
	

    public ListNode partition(ListNode head, int x) {
        
    	ListNode xthhead = new ListNode(0);
    	ListNode ans = xthhead;
    	ListNode curr = new ListNode(0);
    	ListNode y = curr;
    	curr.next = head;
    	
    	while(curr.next != null) {
    		if(curr.next.val > x) {
    			xthhead.next = curr.next;
    			xthhead = xthhead.next;
    			curr.next = curr.next.next;
    		}
    		curr = curr.next;
    	}
    	
    	xthhead.next = y.next;
    	
    	
    	return ans.next;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
