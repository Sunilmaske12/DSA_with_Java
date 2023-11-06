package two_D_Array;

//1 print no. of 7's in array
//2. print sum of element of second rows
public class Two_d_Array_Homework {
	public static void main(String[] args) {
		int arr[][] = {
				{ 10, 20, 12, 7, 7},
				{ 2, 4, 7, 9, 11},
				{11, 12, 13, 7, 0},
				{11, 7, 70, 8, 6}
		};
		
		noOf7(arr);
		sumOfSecondRow(arr);
		transposeMatrix(arr);
	}

	

	private static void transposeMatrix(int[][] arr) {
		int[][] transMat = new int[arr[0].length][arr.length];
		
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				transMat[col][row] = arr[row][col];
			}
		}
		
		for(int row=0; row<transMat.length; row++) {
			for(int col=0; col<transMat[row].length; col++) {
				System.out.print(transMat[row][col]+" ");
			}
			System.out.println();
		}
		
	}



	private static void sumOfSecondRow(int[][] arr) {
		int sum = 0;
		for(int col=0; col<arr[1].length; col++) {
			sum+= arr[1][col];
		}
		System.out.println("Sum "+sum);
	}

	private static void noOf7(int[][] arr) {
		
		int n=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j]==7) n++;
			}
		}
		System.out.println("Array contain "+n+"-times 7");
	}
}
