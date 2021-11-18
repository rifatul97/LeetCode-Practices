package others;

import java.util.ArrayList;
import java.util.List;

public class findDisappearedNumbers {

	public static List<Integer> findDisappearedNumbers(int[] nums) {
        //boolean[] check = new boolean[nums.length+1];
		List<Integer> ans = new ArrayList<Integer>();
		
        for(int n=0; n<nums.length; n++){
            int temp = nums[nums[n]];
            nums[nums[n]] = -1;
            nums[n] = temp;
        }
        
        for(int i=1; i<nums.length; i++){
            if(nums[i] != -1){
                ans.add(nums[i]);
            }
        }
        
        System.out.println(ans.toString());
        
        return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,3,2,7,8,2,3,1};
		findDisappearedNumbers(arr);
	}

}
