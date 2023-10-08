package arrays;

public class PairsInArray {

	public static void main(String[] args) {
		
		int arr[]= {12,45,90,111,113,145,178,900};
		
		pairs(arr);

	}

	private static void pairs(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				System.out.print("("+arr[i]+","+arr[j]+") ");
			}
			System.out.println();
		}
		
	}

}
