package array;

import java.util.HashMap;

public class subarraySum {
    public static int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap();
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return (count);
    }

    public static void main (String[] args){
        int [] arr = {4, 5, 0, -2, -3, 1};
        System.out.println(subarraySum(arr, 5));
    }
}
