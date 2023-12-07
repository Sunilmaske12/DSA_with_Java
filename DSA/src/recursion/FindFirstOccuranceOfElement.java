package recursion;

public class FindFirstOccuranceOfElement {
	
	private static int getOcc(int[] arr, int i, int key) {
		if(i==arr.length) {
			return -1;
		}
		if(arr[i]==key) {
			return i;
		}
		return getOcc(arr, i+1, key);
	}

	public static void main(String[] args) {
		
		int[] arr= {12,45,12,67,45,90,90,45,67};
		System.out.println(getOcc(arr, 0, 45));
	}

}
