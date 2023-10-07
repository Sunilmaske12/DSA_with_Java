package methods;

public class CheckPalindrome {

	public static void main(String[] args) {
		int n=12222221;
		boolean res = palindrome(n);
		if(res) System.out.println(n+" is palindrome");
		else System.out.println(n+" is not palindrome");

	}

	private static boolean palindrome(int n) {
		int initialNum = n;
		int revNum = 0;
		while(n>0) {
			int lastDig = n%10;
			revNum = revNum*10 + lastDig;
			n /=10; 
		}
		if(initialNum == revNum) return true;
		return false;
	}

}
