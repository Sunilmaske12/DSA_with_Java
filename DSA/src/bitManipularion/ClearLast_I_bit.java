package bitManipularion;

public class ClearLast_I_bit {

	public static void main(String[] args) {
		
		int n = 10;
		int i=2;
		int bitMask = (~0)<<i;
		System.out.println(n & bitMask);

	}

}
