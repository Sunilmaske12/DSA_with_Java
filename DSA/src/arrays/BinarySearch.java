package arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[]= {12,45,90,111,113,145,178,900};
		int key = 113;
		int i=binarySearch(arr, key);
		System.out.println("Element found at "+i);

	}

	private static int binarySearch(int[] arr, int key) {
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = (start+end)/2;
			System.out.println(mid+"  "+arr[mid]);
			if(arr[mid]==key) {
				return mid;
			}
			if(arr[mid]<key) {
				start = mid+1;
			}
			else {
				end=mid-1;
			}
		}
		
		return -1;
	}

}
