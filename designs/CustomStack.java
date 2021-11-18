package designs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CustomStack {
	
	class customStack {
		int val;
		//boolean available;
		customStack (int val) {
			this.val = val;
		//	this.available = true;
		}
		customStack () {
		//	this.available = false;
		}
	}
	
	private customStack[] stack;
	private int currptr;
	
	
    public CustomStack(int maxSize) {
        stack = new customStack[maxSize];
        currptr = -1;
    }
    
    public void push(int x) {
    	if(currptr+1 >= stack.length) return;
    	stack[currptr+1] = new customStack(x);
    	currptr++;
    }
    
    public int pop() {
    	if(currptr == -1) return -1;
    	int pop = stack[currptr].val;
    	stack[currptr] = null;
    	currptr--;
    	System.out.print(pop+"\n");
        return pop;
    }
    
    public void increment(int k, int val) {
    	k = k > stack.length ? stack.length : k;
        for(int i=0; i<k; i++) {
        	if(stack[i] == null) break;
        	stack[i].val += val;
        }
    }


	public static void main(String[] args) {
		CustomStack customStack = new CustomStack(3); // Stack is Empty []
		customStack.push(1);                          // stack becomes [1]
		customStack.push(2);                          // stack becomes [1, 2]
		customStack.pop();                            // return 2 --> Return top of the stack 2, stack becomes [1]
		customStack.push(2);                          // stack becomes [1, 2]
		customStack.push(3);                          // stack becomes [1, 2, 3]
		customStack.push(4);                          // stack still [1, 2, 3], Don't add another elements as size is 4
		customStack.increment(5, 100);                // stack becomes [101, 102, 103]
		customStack.increment(2, 100);                // stack becomes [201, 202, 103]
		customStack.pop();                            // return 103 --> Return top of the stack 103, stack becomes [201, 202]
		customStack.pop();                            // return 202 --> Return top of the stack 102, stack becomes [201]
		customStack.pop();                            // return 201 --> Return top of the stack 101, stack becomes []
		customStack.pop();                            // return -1 --> Stack is empty return -1.
		customStack.push(100);
		customStack.push(101);
		customStack.push(102);
		customStack.push(103);
		customStack.pop();
		customStack.increment(3, -10);
		customStack.pop();
	}

}
