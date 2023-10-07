package methods;

public class PrimeNumCheck {

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
		
		int n=4;
		
		boolean isPrime=true;
		
		isPrime = checkPrime(n);
		
		if(isPrime) {
			System.out.println(n+" is a prime num");
		}
		else System.out.println(n+" is not prime num");

	}



}
