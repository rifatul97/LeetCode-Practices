package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class merge {
	
	/*
	Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
	Output: [[1,6],[8,10],[15,18]]
	 */
	
	public static int[][] merge(int[][] intervals) {
        
		if(intervals.length == 0) {
			return intervals;
		}
		
		Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
		List<int[]> result = new ArrayList<int[]>();
		
		int[] newInterval = intervals[0];
		
		result.add(newInterval);
		
		System.out.println(newInterval[0]);
		
		
		return intervals;
      }
	
	public static void main(String[] args) {
		int[][] intervals1 = {{1,3},{3,6},{8,10},{15,18}};
		int[][] intervals2 = {{1,4},{5,5}};
		
		merge(intervals2);
	}
	
	
    }
