package arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int arr[]= {12,45,90,111,113,145,178,900};
		
		//method 1 ==> space complexity more
		reverseArray1(arr);
		System.out.println();
		//method 2 ==> space complexity less
		reverseArray2(arr);
		System.out.println("\nReverse of reversed array :");
		reverseArray3(arr);
	}

	
	private static void reverseArray1(int[] arr) {
		int reversedArray[] = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			reversedArray[i] = arr[arr.length-1-i];
		}
		for(int s:reversedArray) {
			System.out.print(s+" ");
		}
		
	}

	private static void reverseArray2(int[] arr) {

		int temp;
		for(int i=0; i<arr.length/2; i++) {
			
			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
			}
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	
	private static void reverseArray3(int[] arr) {
		
		int temp, start=0, end=arr.length-1;
		
		while(start<end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
	}


}
