package arrays;

public class Subarrays {

	public static void main(String[] args) {
		
		int arr[]= {12,45,90,111,113,145,178,900};

		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				for(int k=i; k<=j; k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
	}

}
