package recursion;

public class NumberInDecresing {
	
	private static void printNum(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		printNum(n-1);
		
	}

	public static void main(String[] args) {
		
		printNum(10);

	}

}
