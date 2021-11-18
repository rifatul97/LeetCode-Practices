package stack;

import java.util.Stack;

public class dailyTemperatures {
	
	public static int[] dailyTemperatures(int[] T) {
        
		int[] nextMoreArr = new int[T.length];
		Stack<int[]> nextmore = new Stack<int[]>(); // int[value, index]
		
		for(int i=0; i<T.length; i++) {
			
			while(!nextmore.isEmpty() && nextmore.peek()[0] < T[i]) {
				nextMoreArr[nextmore.peek()[1]] = i - nextmore.peek()[1];
				nextmore.pop();
			}
			
			/*if(nextmore.isEmpty()) {
				nextMoreArr[i] = 0; 
			}
			else {
				nextMoreArr[i] = 
			} */
			
			nextmore.push(new int[] {T[i], i});
			
		}
		
		//printarr(nextMoreArr);
		
		
		return nextMoreArr;
    }
	
	static void printarr(int[] arr) {
		
		for(int x : arr) System.out.print(x + " ");
		
		System.out.print("\n");
		
	}

	public static void main(String[] args) {
		
		dailyTemperatures(new int[] {});

	}

}
