package arrays;

public class LinearSearch {

	private static int linearSearch(int[] arr, int key) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,3,4,7,10,20,11,23};
		int key = 24;
		int i = linearSearch(arr, key);
		System.out.println("Element found at "+i+" location");
	}

	

}
