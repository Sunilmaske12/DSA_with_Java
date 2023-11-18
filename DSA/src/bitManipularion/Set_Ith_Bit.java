package bitManipularion;

public class Set_Ith_Bit {

	public static void main(String[] args) {
		//setting ith bit i.e. 1
		
		int n=10;
		int i=2;
		int bitMark = 1<<i;
		System.out.println(n | bitMark);

	}

}
