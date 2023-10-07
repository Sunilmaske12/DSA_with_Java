package methods;

public class BinaryToDecimal {
	
private static void decimal(int i) {
		
		int myNum = i;
		int decNum = 0;
		int lastDig;
		int pow=0;
		while(i>0) {
			lastDig = i%10;
			decNum = decNum + (lastDig*(int)Math.pow(2, pow));
			pow++;
			i = i/10;
		}
		System.out.println("Decimal of "+myNum+" is "+decNum);
		
	}

	public static void main(String[] args) {
		
		decimal(101);
		decimal(111);
		decimal(1111);
		decimal(1000);

	}

	

}
