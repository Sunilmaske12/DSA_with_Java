package recursion;

public class PrintXpowN_OptimisedWay {
	
	private static int power(int num, int pow) {
		if(pow==0) {
			return 1;
		}
		int halfPow = power(num, pow/2);
		if(pow%2==1) {
			return num*halfPow*halfPow;
		}
		return halfPow*halfPow;
	}

	public static void main(String[] args) {
		//O(logn) complexity
		System.out.println(power(2,5));
	}

}
