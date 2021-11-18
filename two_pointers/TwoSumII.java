package two_pointers;

public class TwoSumII {
	public static int[] twoSum(int[] numbers, int target) {
		
		int n = numbers.length;
    }

	public static int binarySearch(int start, int end, int target, int[] nums) {
		
		while(start < end) {
			int mid = (start+end)/2;
			
			if(nums[mid] == target) {
				return mid;
			}
			
			if(nums[mid] < target) {
				start++;
			}
			else {
				end--;
			}
			
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		System.out.println(twoSum(new int[]{1,2,3,4,5}, 6)[0] + " " +  twoSum(new int[]{1,2,3,4,5}, 6)[1]);
		
	}
}
