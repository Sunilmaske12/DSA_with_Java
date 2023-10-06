package patterns;

//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1


public class Pattern9 {

	public static void main(String[] args) {
		int row=5; 
		int rowNum=1;
		
		for(int i=1; i<=row; i++) {
			int num = rowNum;
			for(int j=1; j<=i; j++) {
				System.out.print(num+ " ");
				num = num==1?0:1;
			}
			rowNum = rowNum==1?0:1;
			System.out.println();
		}

	}

}
