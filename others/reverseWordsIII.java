package others;

public class reverseWordsIII {
	public static String reverseWords(String s) {
        
		int spacepoint = 0;
		int st = 0;
		char[] sarr = s.toCharArray();
		
		for(int i=0; i<sarr.length; i+= spacepoint) {
			spacepoint = i;
			
			while(spacepoint != s.length()-1 || s.charAt(spacepoint) == ' ') {
				spacepoint++;
			}
			
			int ed = spacepoint;
			
			while(st <= ed) {
				char temp = sarr[st];
				sarr[st] = sarr[ed];
				sarr[ed] = temp;
				st++; ed--;
			}
			
			st = spacepoint+1;
			
		}
		
		String ans = "";
		
		for(int i=sarr.length-1; i>=0; i--) {
			ans += sarr[i];
		}
		
		return ans;
    }
	
	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}
}
