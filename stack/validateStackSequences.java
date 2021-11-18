package stack;

import java.util.Stack;

public class validateStackSequences {
	
	public static boolean validateStackSequences(int[] pushed, int[] popped) {
		
		Stack<Integer> stack = new Stack<Integer>();
		int index = 0;
		
		for(int push : pushed) {
			
			stack.push(push);
			
			while(!stack.isEmpty() && index < popped.length && stack.peek() == popped[index]) {
				stack.pop(); index++;
			}
			
		}
		
		
		return stack.isEmpty();
    }

	public static void main(String[] args) {
		int[] pushed = {1,2,3,4,5};
		int[] popped = {4,3,5,1,2};
		System.out.println(validateStackSequences(pushed, popped));
	}

}
