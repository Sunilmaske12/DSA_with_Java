package string;

import java.util.Arrays;

public class AnagramString {

	// Anagram String : two string conntain same charactor but may be in a different order and case
	public static void main(String[] args) {
		
		String str1 = "Heart";
		String str2 = "Earth";
		
		//convert both string into lower case
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		//check length
		if(str1.length() == str2.length()) {
			
			char[] str1Array = str1.toCharArray();
			char[] str2Array = str2.toCharArray();
		
			//sorting
			Arrays.sort(str1Array);
			Arrays.sort(str2Array);
			
			boolean result = Arrays.equals(str1Array, str2Array);
			
			if(result)	System.out.println(str1+" and "+str2+" is  anagram");
			else  System.out.println(str1+" and "+str2+" is not anagram");
			
		}else {
			System.out.println(str1+" and "+str2+" is not anagram");
		}

	}

}
