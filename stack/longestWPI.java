package stack;

import java.util.Stack;

public class longestWPI {

	public static int longestWPI(int[] hours) {
        
		Stack<Integer> stack = new Stack<Integer>();
		int max = 0;
		
		for(int i=0; i<hours.length; i++) {
			
			if(!stack.isEmpty() && stack.peek() <= 8 && hours[i] <= 8) {
				stack.pop();
			}
			else {
				stack.push(hours[i]);
			}
			
			max = Math.max(stack.size(), max);
			
		}
		
		System.out.println(stack.toString());
		
		return max;
	}
	
	public static void main(String[] args) {
		int[] test = {6};
		System.out.println(longestWPI(test));
		
		
	}

}
