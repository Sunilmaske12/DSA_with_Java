package arrays;

public class PrintLargestNum {

	private static int searchLarge(int[] arr) {
		int large = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(large < arr[i]) {
				large = arr[i];
			}
		}
		return large;
	}

	public static void main(String[] args) {
		int arr[] = {1,3,4,700,10,20,11,23};
		int large = searchLarge(arr);
		System.out.println(large);
	}

	
}
