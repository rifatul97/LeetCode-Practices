package stack;

import java.util.Arrays;
import java.util.Stack;

public class MonotonousStack {
	
	public static void previousless(int[] a) {
		
		int[] prevlessarr = new int[a.length];
		Arrays.fill(prevlessarr, -1);
		Stack<Integer> prevLess = new Stack<>();
		
		for(int i=0; i<a.length; i++) {
			while(!prevLess.isEmpty() && a[prevLess.peek()] > a[i]) {
				prevLess.pop();
			}
			
			if(prevLess.isEmpty()) {
				prevlessarr[i] = -1;
			}
			else {
				prevlessarr[i] = prevLess.peek();
			}
			
			prevLess.push(i);
		}

		printarr(prevlessarr);
	}
	
	public static void nextLess(int[] arr) {
		int[] nextlessarr = new int[arr.length];
		Stack<Integer> nextless = new Stack<Integer>();
		
		for(int i=arr.length-1; i>=0; i--) {
			
			while(!nextless.isEmpty() && arr[nextless.peek()] > arr[i]) {
				nextless.pop();
			}
			
			if(nextless.isEmpty()) {
				nextlessarr[i] = -1;
			}
			else {
				nextlessarr[i] = nextless.peek();
			}
			
			nextless.push(i);
			
		}
		
		printarr(nextlessarr);
	}

	public static int sumSubarrayMins(int[] A) {
		
		Stack<int[]> prevLess = new Stack<>();
		Stack<int[]> nextLess = new Stack<>();
		int[] leftDist = new int[A.length];
		int[] rightDist = new int[A.length];
		
		for(int i=0; i<A.length; i++) {
			
			while(!prevLess.isEmpty() && prevLess.peek()[0] >= A[i]) {
				prevLess.pop();
			}
			
			if(prevLess.isEmpty()) {
				leftDist[i] = i+1;
			}
			else {
				leftDist[i] = i - prevLess.peek()[1];
			}
			
			prevLess.push(new int[] {A[i], i});
			
		}
		
        for(int i=A.length-1; i>=0; i--)
        {
            while(!nextLess.isEmpty() && nextLess.peek()[0] > A[i])
            {
                nextLess.pop();
            }
            
            rightDist[i] = nextLess.isEmpty() ? A.length - i : nextLess.peek()[1] - i;
            nextLess.push(new int[]{A[i], i});
        } 
        

        printarr(rightDist);
        
        int ans = 0;
        int mod = 1000000007;
        for(int i=0; i<A.length; i++)
        {
            ans = (ans + A[i] * leftDist[i] * rightDist[i]) % mod;
        }
        
        System.out.println(ans);
        
        return ans;
	}
	
	static void printarr(int[] arr) {
		
		for(int x : arr) System.out.print(x + " ");
		
		System.out.print("\n");
		
	}
	
	
	public static void main(String[] args) {	
		int[] arr = {3, 7, 8, 4};
		int[] test = {9, 3, 6, 12, 18, -9999, 0}; 
		printarr(arr);
		//sumSubarrayMins(arr);
		//monoincreasestack(arr);
		//previousless(arr);
		nextLess(arr);
	}	
	
}

/*
	
	public static void monoincreasestack(int[] a) {
		Stack<Integer> increasestack = new Stack<Integer>();
	
		for(int val : a) {
			while(!increasestack.isEmpty() && increasestack.peek() > val) {
				increasestack.pop();
			}
			increasestack.push(val);
		}
		
		System.out.print(increasestack.toString());
	}
*/
