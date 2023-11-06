package arrays;

public class AllSortingTechniques_HW {

		public static void main(String[] args) {
			
			int[] arr1= {12,50,21,4,7,10,89};
			int[] arr2= {12,50,21,4,7,10,89};
			int[] arr3= {12,50,21,4,7,10,89};
			int[] arr4= {12,50,21,4,7,10,89, 3, 2, 12, 50, 4, 7 ,7, 7, 50};
			
			bubbleSort(arr1);
			printArray(arr1);

			insertionSort(arr2);
			printArray(arr2);

			selectionSort(arr3);
			printArray(arr3);
			
			countingSort(arr4);
			printArray(arr4);
		}

		private static void countingSort(int[] arr4) {
			System.out.println("\n\nCounting Sort");
			//find length for new array
			//len = large element + 1
			int largeElement = Integer.MIN_VALUE;
			for(int i=0; i<arr4.length; i++) {
				largeElement = Math.max(largeElement, arr4[i]);
			}
			
			//creating new array
			int[] freq = new int[largeElement+1];
			
			//storing freq in array 
			for(int i=0; i<arr4.length; i++) {
				freq[arr4[i]]++;
			}
			
			//sorting
			int j=0;
			for(int i=0; i<freq.length; i++) {
				while(freq[i]>0) {
					arr4[j] = i;
					j++;
					freq[i]--;
				}
			}
			
		}

		private static void selectionSort(int[] arr) {
			System.out.println("\n\nSelection Sort");
				for(int i=0; i<arr.length-1; i++) {
					int minPos= i;
					for(int j=i+1; j<arr.length; j++) {
						if(arr[minPos]>arr[j]) {
							minPos = j;
						}
					}
					int temp = arr[i];
					arr[i] = arr[minPos];
					arr[minPos] = temp;
				}
		}

		private static void insertionSort(int[] arr) {
			System.out.println("\n\nInsertion Sort");
			
			for(int i=1; i<arr.length; i++) {
				int curEle = arr[i];
				int prePos = i-1;
				
				//finding correct position and moving element forward
				while(prePos>=0 && arr[prePos]>curEle) {
					arr[prePos+1] = arr[prePos];
					prePos -- ;
				}
				
				//insertion
				arr[prePos+1] = curEle;
			}
		
		}

		

		private static void bubbleSort(int[] arr) {
			System.out.println("\n\nBubble Sort");

			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr.length-1-i; j++) {
					if(arr[j]>arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
			
			
		}
		
		private static void printArray(int[] res) {
			for(int r:res) {
				System.out.print(r+" ");
			}
			
		}
}
