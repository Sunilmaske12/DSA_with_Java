package recursion;

public class SumOfN {
	
	private  int getSum(int n) {
		if(n==0) {
			return 0;
		}
		return n + getSum(n-1);
	}

	public static void main(String[] args) {
		
		SumOfN obj=new SumOfN();
		
		System.out.println(obj.getSum(10));

	}

}
