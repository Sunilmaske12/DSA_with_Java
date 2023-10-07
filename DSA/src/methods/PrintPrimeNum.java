package methods;

public class PrintPrimeNum {
	
private static boolean checkPrime(int n) {
		
		if(n==2) {
			return true;
		}
		
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {

		int n=20;
		
		for(int i=2; i<=n; i++) {
			boolean isPrime= checkPrime(i);
			if(isPrime) System.out.println(i);
		}

	}

}
