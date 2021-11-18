package designs;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class MinStack {
	
	Deque<Integer> stack;
    int min;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new LinkedList<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        if (x <= min) {
            stack.offerFirst(min);
            min = x;
        }
        stack.offerFirst(x);
    }
    
    public void pop() {
        if (min == stack.pollFirst()) {
            min = stack.pollFirst();
        }
    }
    
    public int top() {
        return stack.peekFirst();
    }
    
    public int getMin() {
        return min;
    }
	
	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		minStack.getMin(); // return -3
		minStack.pop();
		minStack.top();    // return 0
		minStack.getMin(); // return -2
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-4);
		minStack.push(22);
		minStack.push(13);
		minStack.push(9);
		minStack.getMin();
		minStack.pop();
		minStack.pop();
		minStack.pop();
		minStack.pop();
		minStack.getMin();
		minStack.push(92);
	}

}
