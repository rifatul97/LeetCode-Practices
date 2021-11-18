package hashtables;

public class firstUniqChar {
	
	public int firstUniqChar(String s) {
		int index = -1;
		for(int i = 'a'; i <= 'z'; i++) {
			int temp = s.indexOf(i);
			if(temp != -1 && temp == s.lastIndexOf(i) && (index == -1 || temp < index)) {
				index = temp;
			}
		}
		
		return index;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
