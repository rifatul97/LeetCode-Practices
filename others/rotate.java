package others;
// https://leetcode.com/problems/rotate-array/description/
public class rotate {
	
	public static void rotate(int[] nums, int k) {
        if(k%nums.length-1 == 0) {
        	return;
        }
        
        int i = 0;
        int K = k;
        while(i < K) {
        	int temp = nums[i];
        	nums[i] = nums[nums.length-k];
        	nums[nums.length-k] = temp;
        	i++;
        	k--;
        }
        
        for(int j=i; j<nums.length-1; j++) {
        	int temp = nums[j];
        	nums[j] = nums[j+1];
        	nums[j+1] = temp;
        }
        
    }

	public static void main(String[] args) {
		int[] test = {1,2,3,4,5,6,7};
		
		rotate(test, 2);
		
		for(int val : test) {
			System.out.print(val + " ");
		}
		
		System.out.println();
	}

}
