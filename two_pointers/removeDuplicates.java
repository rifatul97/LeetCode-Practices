package two_pointers;
import java.util.Stack;

public class removeDuplicates {

	/* i refers to the index to set next character in the output string.
	   j refers to the index of current iteration in the input string.

	   Iterate characters of S one by one by increasing j.

	   If S[j] is same as the current last character S[i - 1],
       we remove duplicates by doing i -= 2.

       If S[j] is different as the current last character S[i - 1],
       we set S[i] = S[j] and increment i++. */
	
	public static String removeDuplicates_twoptr(String s) {
        
        int i = 0;
        char[] res = s.toCharArray();
        
        for(int j=0; j<s.length(); ++j, ++i) {
        	res[i] = res[j];
        	if(i > 0 && res[i] == res[i-1]) {
        		i-=2;
        	}
        }
        
        return new String(res, 0, i);
    }
	
	public static void main(String[] args) {
		System.out.println(removeDuplicates_twoptr("abbaca"));
		System.out.println(removeDuplicates_twoptr("aaaaaaaaaaaa"));
		System.out.println();
		System.out.println(removeDuplicates_stack("aaftdftfhtfgvgbcba"));
		
		char[] charr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
	}
	
	public static String removeDuplicates(String S) {        
        if (S == null || S.length() == 0) return "";
		char[] stack = S.toCharArray();
		
		int currptr = -1;
		
		for(char c : stack) {
			if(currptr >= 0 && stack[currptr] == c) {
				currptr--;
			}
            else{
                stack[++currptr] = c;
            }
		}
		return new String(stack, 0, currptr+1);
    }
	
	
	public static String removeDuplicates_stack(String S) {
        
		if(S.length() <= 1) return S;
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i < S.length(); i++) {
			
			if(!stack.isEmpty() && stack.peek() == S.charAt(i)) {
				stack.pop();
				continue;
			}
			
			stack.push(S.charAt(i));
			
		}
		
		return stack.toString();
    }

}
/*
Input: "abbaca"
Output: "ca"
 */