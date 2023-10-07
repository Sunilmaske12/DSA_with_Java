package methods;

public class BionomialCoefficient {
	
	int binCoeff(int n, int r) {
		int nfact = factorial(n);
		int rfact = factorial(r);
		int NminRfact = factorial(n-r);
		return (nfact)/(rfact*NminRfact);
	}

	private int factorial(int num) {
		int fact=1;
		while(num>0) {
			fact = fact*num;
			num--;
		}
		return fact;
	}

	public static void main(String[] args) {
		
		int n=5, r=2;
		BionomialCoefficient bc=new BionomialCoefficient();
		
		int res = bc.binCoeff(n, r);
		
		System.out.println(res);

	}

}
