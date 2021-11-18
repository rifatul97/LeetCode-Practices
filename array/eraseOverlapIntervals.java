package array;

import java.util.Arrays;

public class eraseOverlapIntervals {

	public int eraseOverlapIntervals(int[][] intervals) {
        
		int count = 0;
		
		Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
		
		int start = intervals[0][0];
		int end = intervals[0][1];
		
		for(int[] interval : intervals) {
			
			if(end >= interval[1] && start >= interval[0]) {
				count ++;
			}
			else if(end < interval[1]) {
				end = interval[1];
			}
			
		}
		
		return count;
    }
	
	
	public static void main(String[] args) {
	}

}
