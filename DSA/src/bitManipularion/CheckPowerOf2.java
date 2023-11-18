package bitManipularion;

public class CheckPowerOf2 {

	public static void main(String[] args) {
		// checking given number is a power of 2 or not
		int n = 8;
		
		if( (n & (n-1)) == 0) {
			System.out.println(n+" is a power of 2");
		}
		else {
			System.out.println(n+" is not a power of 2");			
		}

	}

}
