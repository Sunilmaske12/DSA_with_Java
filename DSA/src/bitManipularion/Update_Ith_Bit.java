package bitManipularion;

public class Update_Ith_Bit {

	private static int clearBit(int n, int pos) {
		int bitMark = ~(1<<pos);
		return (n & bitMark);
	}

	private static int setBit(int n, int pos) {
		int bitMark = 1<<pos;
		return (n | bitMark);
	}
	public static void main(String[] args) {
		
		int n=15;
		int newBit = 0;
		int pos = 2;
		//approach 1
		if(newBit == 0) {
			System.out.println(clearBit(n , pos));
		}
		else {
			System.out.println(setBit(n, pos));
		}
		
		
		int n2=15;
		//approach 2
		 n2 = clearBit(n2 , pos);
		int bitMask = newBit << pos;
		System.out.println(n2 | bitMask);

	}

	
}
