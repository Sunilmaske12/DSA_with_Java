package recursion;

public class RemoveDuplicateInString {

	private  static void removeDuplicate(String str, StringBuilder newStr, int i, boolean[] map) {
		
		if(i==str.length()) {
			System.out.println(newStr);
			return;
		}

		char c = str.charAt(i);

		if(map[c-'a']==false) {
			map[c-'a'] = true;
			removeDuplicate(str, newStr.append(c), i+1, map);
		}else {
		removeDuplicate(str, newStr, i+1, map);
		}
	}
	
	public static void main(String[] args) {
		
		removeDuplicate("apppnnacolllaage", new StringBuilder(), 0, new boolean[26]);
	}

}
