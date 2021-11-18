package designs;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
	
	private Queue<Integer> stack;
	private Queue<Integer> input;
	
	
	public MyStack() {
        stack = new LinkedList<Integer>();
        input = new LinkedList<Integer>();
	}
    
    /** Push element x onto stack. */
    public void push(int x) {
        stack.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
    	int pop = this.top();
    	input.poll();
        return pop;
    }
    
    /** Get the top element. */
    public int top() {
    	if(input.isEmpty()) {
    		while(!stack.isEmpty()) {
    			input.add(stack.poll());
    		}
    	}
    	
    	return input.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }

	public static void main(String[] args) {
		MyStack stack = new MyStack();

		stack.push(1);
		stack.push(2);  
		System.out.println(stack.top());   // returns 2
		System.out.println(stack.pop());   // returns 2
		stack.empty(); // returns false
	}

}
