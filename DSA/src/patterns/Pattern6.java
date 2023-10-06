package patterns;

//   *
//  **
// ***
//****
public class Pattern6 {

	public static void main(String[] args) {
		
		int row=4, col=4;
		
		for(int i=1; i<=row; i++) {
			for(int j=col-i; j>=1; j--) {
				System.out.print("  ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
