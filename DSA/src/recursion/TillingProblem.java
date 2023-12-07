package recursion;

//given a 2*n board and tiles of size 2*1 count the number of ways to tile the board using 2*1 tiles(can arrange in horizental  or vertical)

public class TillingProblem {
	
	private static int getNosWays(int n) { //n is from 2*n size i.e. breadth
		if(n==0 || n==1) {
			return 1;
		}
		
		//choice = horizental
		int fnm2 = getNosWays(n-2);
		
		//choice =vertical
		int fnm1 = getNosWays(n-1);
		
		return fnm1+fnm2;
	}

	public static void main(String[] args) {
		
		System.out.println(getNosWays(5));
	}

}
