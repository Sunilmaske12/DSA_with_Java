package methods;

public class DecimalToBinary {

	public static void main(String[] args) {
		binary(12);
		binary(25);
		binary(13);
		binary(5);

	}

	private static void binary(int i) {
		int myNum = i;
		long binNum=0;
		int pow = 0;
		while(i>0) {
			int rem = i%2; 
			binNum = binNum + rem*(int)Math.pow(10, pow);
			i = i/2;		
			pow++;
		}
		System.out.println("Binary of "+myNum+" = "+binNum);
		
	}

}
