package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findDuplicates {
	
	public List<Integer> findDuplicates(int[] nums) {
        
		int[] check = new int[nums.length];
		Arrays.fill(check, -1);
		List<Integer> ans = new ArrayList<Integer>();
		
		for(int val : nums) {
			check[val]++;
			if(check[val] >= 2) {
				ans.add(val);
			}
		}
		
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
