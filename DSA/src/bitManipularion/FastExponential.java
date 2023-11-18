package bitManipularion;

public class FastExponential {

	public static void main(String[] args) {
		int a = 5, n=5; //ww have to find a power n
		
		int ans = 1;
		
		while(n>0) {
			if((n&1)!=0) {
				ans = a*ans;
			}
			a = a*a;
			n = n>>1;
		}
		System.out.println(ans);

	}

}
