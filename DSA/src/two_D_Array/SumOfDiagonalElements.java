package two_D_Array;

public class SumOfDiagonalElements {
	
	private static int sumOfDialonalElementM1(int[][] arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(i==j) sum+=arr[i][j];
				else if(i+j==arr.length-1) sum+=arr[i][j];
			}
		}
		return sum;
	}

	//optimised way
	private static int sumOfDialonalElementM2(int[][] arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			//primary diagonal
			
				sum+=arr[i][i];
		
			//secondary diagonal
				if(i!=arr.length-1-i) {
					sum+=arr[i][arr.length-1-i];
				}
		}
		return sum;
	}


	public static void main(String[] args) {
		
		int[][] arr= 
			{
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}
			};
		
		int sum1 = sumOfDialonalElementM1(arr);
		int sum2 = sumOfDialonalElementM2(arr);
		System.out.println(sum1+"  "+sum2);

	}
}
