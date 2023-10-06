package patterns;


//*      *
//**    **
//***  ***
//********
//***  ***
//**    **
//*	   *

public class Pattern10Butterfly {

	public static void main(String[] args) {
		int row=8, col=8;
		
		for(int i=1; i<=row/2; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			for(int j=i; j<=col-i-1; j++) {
				System.out.print("  ");
				
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=row/2; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			for(int j=i; j<=col-i-1; j++) {
				System.out.print("  ");
				
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
