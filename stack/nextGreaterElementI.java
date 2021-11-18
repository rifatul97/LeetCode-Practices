package stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class nextGreaterElementI {
	/*
	Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
	Output: [-1,3,-1]    */
	public static int[] nextGreaterElement(int[] findNums, int[] nums) {
	
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Stack<Integer> monostack = new Stack<Integer>();
		
		for(int i=0; i<nums.length; i++) {
			while(!monostack.isEmpty() && monostack.peek() < nums[i]) {
				map.put(monostack.pop(), nums[i]);
			}
			monostack.push(nums[i]);
		}
		
		
		for(int i = 0; i<findNums.length; i++) {
			findNums[i] = map.getOrDefault(findNums[i], -1);
		}
		
        return findNums;
	}

	static void printarr(int[] arr) {
		
		for(int x : arr) System.out.print(x + " ");
		
		System.out.print("\n");
		
	}
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4};
		int[] b = {2, 4};

		printarr(nextGreaterElement(b, a));
		
	}

}

/*
int[] a = {9, 8, 7, 1, 2, 3, 6};
int[] b = {1, 2, 3};
*/