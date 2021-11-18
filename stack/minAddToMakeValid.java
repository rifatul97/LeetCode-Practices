package stack;

import java.util.Stack;

public class minAddToMakeValid {
	
	public static int minAddToMakeValid(String S) {
        
		Stack<Character> stack = new Stack<Character>();
		
		for(char ch : S.toCharArray()) {
			if(!stack.isEmpty() && stack.peek() == '(' && ch == ')') {
				stack.pop();
			}
			else{
				stack.push(ch);
			}
		}
		
		return stack.size();
    }

	public static void main(String[] args) {
		System.out.println(minAddToMakeValid(")))"));
	}

}
