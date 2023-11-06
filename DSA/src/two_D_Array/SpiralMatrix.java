package two_D_Array;

public class SpiralMatrix {

	private static void spiralArr(int[][] arr) {
		System.out.println("\n\nSpiral Array");

		int startRow = 0;
		int startCol = 0;
		int endRow = arr.length - 1;
		int endCol = arr[0].length - 1;

		while (startRow <= endRow && startCol <= endCol) {
			for (int j = startCol; j <= endCol; j++) {
				System.out.print(arr[startRow][j] + " ");
			}
			System.out.println();
			for (int i = startCol + 1; i <= endCol; i++) {
				System.out.print(arr[i][endCol] + " ");
			}
			System.out.println();
			for (int j = endCol - 1; j >= startCol; j--) {
				System.out.print(arr[endRow][j] + " ");
			}
			System.out.println();
			for (int i = endCol - 1; i >= startCol + 1; i--) {
				System.out.print(arr[i][startCol] + " ");
			}

			startCol++;
			startRow++;
			endCol--;
			endRow--;
		}
	}

	private static void printArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };

		printArr(arr);
		spiralArr(arr);
	}
}