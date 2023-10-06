package patterns;

//12345
//1234
//123
//12
//1

public class Pattern7 {

	public static void main(String[] args) {
		int row = 5, col=5;
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=col-i+1; j++ ) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
