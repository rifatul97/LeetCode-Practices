package two_pointers;
// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
public class RemoveDuplicatesFromSortedArrayII {
	// nums = [0,0,1,1,1,1,2,3,3] = 7
	public static int removeDuplicates(int[] nums) {
        
		int count = 0;
		int i=0;
		int j = 0;
		
		int currelement = nums[i];
		
		while(true) {
			
			if(i <= nums.length-1 && nums[i] == currelement) {
				
			}
			else {
				if(i-j == 1) {
					nums[count++] = currelement;
				}
				else if(i-j >= 2) {
					nums[count++] = currelement;
					nums[count++] = currelement;
				}
				
				System.out.println(i-j);
				currelement = i > nums.length-1? nums[i-1] : nums[i];
				j = i;
			}
			i++;
			if(i > nums.length) {
				break;
			}
			
		}
		
		return count;
		
    }
	
	public static void main(String[] args) {
		
		System.out.println("ans " + removeDuplicates(new int[] {1,1,1,2,2,3}));
		System.out.println("ans " + removeDuplicates(new int[] {0,0,1,1,1,1,2,3,3}));
		System.out.println("ans " + removeDuplicates(new int[] {1,1,1,2,3,4,5,6,7,8,8,9}));
	}
	
}
