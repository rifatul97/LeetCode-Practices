package designs;

public class MyLinkedList {
	
	class ListNode {
		int val;
		ListNode next;
		ListNode () {
			next = null;
		}
		ListNode (int val) {
			this.val = val;
			next = null;
		}
	}
	
	private ListNode head;
	private int size;
	
	public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(size <= index || size == 0 || index < 0) return -1;
        ListNode temp = head;
        for(int i=0; i<index; i++) {
        	temp = temp.next;
        }
        this.printlist();
        return temp.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        if(head == null) head = new ListNode(val);
        else {
        	ListNode prev = head;
        	head = new ListNode(val);
        	head.next = prev;
        }
        size++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if(head==null) addAtHead(val);
        else {
        	ListNode temp = head;
        	while(temp.next != null) {
        		temp = temp.next;
        	}
        	temp.next = new ListNode(val);
        	size++;
        }
        
    }
    
    /** Add a node of value val before the index-th node in the linked list. 1->2->3->4->5->null 
    // If index equals to the length of linked list, the node will be appended to the end of linked list. 
    // If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
    	if(index > size) {
    		return;
    	}    
    	
    	if(index == 0) {
    		addAtHead(val);
    		return;
    	}
    	
    	if(index == size) {
    		addAtTail(val);
    		return;
    	}
    	
    	ListNode current = head;
        for(int i=0; i<index-1; i++) {
        	current = current.next;
        }
        ListNode next = current.next;
        current.next = new ListNode(val);
        current.next.next = next;
        size++;
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
    	if(index > size-1) {
    		return;
    	}
    	
    	size--;
    	if(index == 0) {
    		head = head.next;
    		return;
    	}
    	
    	ListNode temp = head;
        for(int i=0; i<index; i++) {
        	temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    
    public void printlist() {
    	ListNode temp = head;
    	while(temp != null) {
    		System.out.print(temp.val + " ");
    		temp = temp.next;
    	}
    	System.out.println();
    }
    
    public int getSize() {
    	return size;
    }
    
    public static void main(String[] args) {
    	 MyLinkedList linkedList = new MyLinkedList(); // Initialize empty LinkedList
		 linkedList.addAtHead(2);
    	 linkedList.deleteAtIndex(1);
    	 linkedList.addAtHead(5);
    	 linkedList.addAtHead(4);
    	 linkedList.addAtHead(3);
    	 linkedList.addAtHead(2);
    	 linkedList.addAtHead(1);
    	 linkedList.addAtTail(6);
    	 linkedList.printlist();
    	 System.out.print(linkedList.get(5) + "\n"); 
    	 linkedList.deleteAtIndex(6);
    	 linkedList.deleteAtIndex(4);
    	 linkedList.printlist();
    	 
	}
	
    
    /*
["MyLinkedList","addAtHead","addAtIndex","addAtIndex","addAtHead","deleteAtIndex","addAtIndex","addAtHead","addAtTail","addAtHead","get","addAtTail","addAtTail","addAtIndex","addAtTail","addAtTail","addAtHead","addAtTail","addAtHead","addAtTail","addAtHead","addAtTail","addAtTail","addAtHead","addAtTail","addAtIndex","addAtHead","deleteAtIndex","addAtHead","addAtHead","addAtHead","addAtHead","addAtIndex","addAtHead","addAtTail","addAtHead","deleteAtIndex","addAtTail","deleteAtIndex","addAtTail","addAtTail","addAtTail","addAtTail","addAtHead","addAtTail","get","addAtIndex","get","deleteAtIndex","addAtTail","addAtHead","addAtTail","addAtTail","addAtIndex","addAtHead","addAtHead","addAtHead","addAtHead","addAtHead","addAtTail","deleteAtIndex","deleteAtIndex","addAtHead","addAtHead","addAtTail","addAtHead","get","addAtIndex","addAtIndex","get","addAtTail","get","addAtTail","deleteAtIndex","get","addAtTail","addAtTail","addAtHead","addAtTail","deleteAtIndex","addAtHead","addAtHead","addAtHead","deleteAtIndex","addAtTail","addAtIndex","addAtTail","addAtTail","addAtIndex","addAtIndex","addAtHead","addAtIndex","addAtHead","addAtHead","addAtTail","addAtIndex","addAtTail","get","addAtHead","addAtTail","addAtHead","addAtHead"]
[[],[86],[1,54],[1,14],[83],[4],[3,18],[46],[3],[76],[5],[79],[74],[7,28],[68],[16],[82],[24],[30],[96],[21],[79],[66],[2],[2],[7,57],[59],[21],[19],[55],[46],[17],[16,41],[97],[85],[63],[30],[11],[16],[91],[29],[47],[20],[12],[80],[15],[12,8],[21],[30],[11],[54],[51],[41],[8,88],[62],[7],[59],[73],[73],[55],[9],[7],[49],[99],[17],[44],[11],[26,86],[10,99],[19],[71],[29],[32],[2],[3],[16],[2],[83],[31],[3],[23],[64],[96],[27],[81],[12,78],[21],[69],[5,35],[8,72],[60],[19,73],[55],[83],[86],[31,70],[49],[19],[64],[22],[25],[13]]


["MyLinkedList","addAtHead","deleteAtIndex","addAtHead","addAtHead","addAtHead","addAtHead","addAtHead","addAtTail","get","deleteAtIndex","deleteAtIndex"]
[[],[2],[1],[2],[7],[3],[2],[5],[5],[5],[6],[4]]
		 linkedList.addAtHead(2);
    	 linkedList.deleteAtIndex(1);
    	 linkedList.addAtHead(5);
    	 linkedList.addAtHead(4);
    	 linkedList.addAtHead(3);
    	 linkedList.addAtHead(2);
    	 linkedList.addAtHead(1);
    	 linkedList.addAtTail(6);
    	 linkedList.printlist();
    	 System.out.print(linkedList.get(5) + "\n"); 
    	 linkedList.deleteAtIndex(6);
    	 linkedList.deleteAtIndex(4);
    	 linkedList.printlist();

["MyLinkedList","addAtHead","deleteAtIndex"]
[[],[1],[0]]
    	 linkedList.addAtHead(1);
    	 linkedList.deleteAtIndex(0);


["MyLinkedList","addAtIndex","addAtIndex","addAtIndex","get"]
[[],[0,10],[0,20],[1,30],[0]]
     */
    
}
