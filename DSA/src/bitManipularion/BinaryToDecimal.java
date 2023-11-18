package bitManipularion;

public class BinaryToDecimal {

	public static void main(String[] args) {
		int num = 11111111;
		int dec = 0;
		int i=0;
		while(num>0) {
			int rem = num%10;
			dec +=rem*Math.pow(2, i);
			i++;
			num = num/10;
		}
		System.out.println(dec);
	}

}
