package stack;

import java.util.Stack;

public class StockSpanner {
/*
[100, 80, 60, 70, 60, 75, 85]
[  1,  1,  1,  2,  1,  4,  6]
 */
	private Stack<int[]> stockStack; 
	
	public StockSpanner() {
		stockStack = new Stack<int[]>();
    }
    
    public int next(int price) {
       int nextVal = 1;
       
       while(!stockStack.isEmpty() && stockStack.peek()[0] < price) {
       	    nextVal += stockStack.pop()[1];
       }
       stockStack.push(new int[] {price, nextVal});
       
       return stockStack.peek()[1];
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockSpanner span = new StockSpanner();
		int[] stocks = {100, 80, 60, 70, 60, 75, 85};
		for(int stock : stocks) {
			System.out.print(span.next(stock) + " ");
		}
	}

}
