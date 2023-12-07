package recursion;

public class FindLastOccuranceOfElement {
	
	private static int getOcc(int[] arr, int i, int key) {
		if(i<0) {
			return -1;
		}
		if(arr[i]==key) {
			return i;
		}
		return getOcc(arr, i-1, key);
	}

	public static void main(String[] args) {
		
		int[] arr= {12,45,12,67,45,90,90,45,67};
		System.out.println(getOcc(arr, arr.length-1, 45));
	}

}
