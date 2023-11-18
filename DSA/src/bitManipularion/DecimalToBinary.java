package bitManipularion;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		int num = 11;
		
		String dec="";
		
		while(num>0) {
			int rem = num%2;
			dec=rem+dec;
			num = num/2;
		}
		System.out.println(dec);
	}

}
