package string;

import java.util.Scanner;

//print how many lower-case vowel present in the string given by user
public class CountLowerCaseVowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.next();
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;				
			}
		}
		System.out.println(count);
		sc.close();
	}

}
