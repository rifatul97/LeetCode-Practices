package stack;

import java.util.LinkedList;
import java.util.Stack;

public class asteroidCollision {
	
	/* We are given an array asteroids of integers representing asteroids in a row.
    For each asteroid, the absolute value represents its size, 
    and the sign represents its direction (positive meaning right, negative meaning left). 
    Each asteroid moves at the same speed.
    Find out the state of the asteroids after all collisions. 
    If two asteroids meet, the smaller one will explode. 
    OK If both are the same size, both will explode. 
    OK Two asteroids moving in the same direction will never meet. */
	

    public static int[] asteroidCollision(int[] asteroids) {
        
    	Stack<Integer> stack = new Stack<Integer>();
    	
    	for(int i=asteroids.length-1; i>=0; i--) {
    		if(stack.isEmpty() || asteroids[i] < 0 || stack.peek() > 0 && asteroids[i] > 0) {
    		  stack.push(asteroids[i]);
    		}
    		else {
    			boolean addToStack = true;
    			while(!stack.isEmpty() && stack.peek() < 0) {
    				if(asteroids[i] == Math.abs(stack.peek())) {
    					stack.pop();
    					addToStack = false;
    					break;
    				}
    				else if(asteroids[i] - Math.abs(stack.peek()) < 0) {
    					addToStack = false;
    					break;
    				}
    				stack.pop();
    			}
    			
    			if(addToStack) {
    				stack.push(asteroids[i]);
    			}
    		}
    		//System.out.println("current: " + stack.toString());
    	}

    	int[] ans = new int[stack.size()];
    	
    	for(int i=0; i<ans.length; i++) {
    		ans[i] = stack.pop();
    	}
    	
    	printarr(ans);
    	
    	return ans;
    }
	
    static void printarr(int[] arr) {
		
		for(int x : arr) System.out.print(x + " ");
		
		System.out.print("\n");
		
	}
    
	
	public static void main(String[] args) {
									       // outputs
		int[] asteroidsA = {5, 10, -5};    //[5, 10]	
		int[] asteroidsB = {8, 5, -3, 3, 2};		   //[]
		int[] asteroidsC = {10, 2, -5};    //[10]
		int[] asteroidsD = {-2, -1, 1, 2}; //[-2, -1, 1, 2]
		int[] asteroidsE = {-2,2,-1,-2};   //[-2]
		
		System.out.println("asteroidsA: " + asteroidCollision(asteroidsA));
		System.out.println("asteroidsB: " + asteroidCollision(asteroidsB));
		System.out.println("asteroidsC: " + asteroidCollision(asteroidsC));
		System.out.println("asteroidsD: " + asteroidCollision(asteroidsD));
		System.out.println("asteroidsE: " + asteroidCollision(asteroidsE));

	}

}