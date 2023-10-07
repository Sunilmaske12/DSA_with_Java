package methods;

public class SumOfDigits {

	public static void main(String[] args) {
		sumOfDig(123400);

	}

	private static void sumOfDig(int i) {
		
		int sum =0;
		while(i>0) {
			int lastDig = i%10;
			sum = sum+lastDig;
			i /=10;
		}
		System.out.println(sum);
		
	}

}
