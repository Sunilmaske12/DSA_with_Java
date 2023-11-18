package bitManipularion;

public class Clear_Ith_Bit {

	public static void main(String[] args) {
		// setting ith bit = 0
		int n=10;
		int i=1;
		int bitMark = ~(1<<i);
		System.out.println(n & bitMark);

	}

}
