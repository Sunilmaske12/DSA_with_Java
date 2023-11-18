package bitManipularion;

public class ClearRangeOfBit {

	public static void main(String[] args) {
		int n= 255;
		int i = 2, j=5;
		
		int left1 = ~(0)<<j;
		int right1 = (n << i) - 1;
		int bitMask = left1+right1;
		
		System.out.println(n & bitMask);
	}

}
