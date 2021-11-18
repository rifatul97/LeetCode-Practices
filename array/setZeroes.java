package array;

import java.util.Arrays;

public class setZeroes {
	
  /*  j 
	i[0,1,1,1] 			[0,0,0,0]
	 [1,0,1,0]    =>    [0,0,0,0]    
	 [1,1,0,1]			[0,0,0,0]
	 */
	
	public static void setZeroes(int[][] matrix) {
        
		boolean setFirstRowZero = false;
		
		for(int i=0; i<matrix.length; i++) {
			if(matrix[0][i] == 0) {
				setFirstRowZero = true;	
			}
		}
	
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<)
		}
		
    }

	public static void main(String[] args) {
		
	}

}
