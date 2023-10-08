package arrays;

		//Minimum and maximum sum of subarray
public class MinMaxAddOfSubarray {

	public static void main(String[] args) {
		int arr[]= {12,45,90,111,113,145,178,900};
		
		int min=Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				int sum = 0;
				for(int k=i; k<=j; k++) {
					sum = sum+arr[k];
				}
				if(sum>max) {
					max = sum;
				}
				if(sum<min) {
					min = sum;
				}
			}
		}
		
		System.out.println("Minimu sum : "+min+"\nMaximum sum : "+max);

	}

}
