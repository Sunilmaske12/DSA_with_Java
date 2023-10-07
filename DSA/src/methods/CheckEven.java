package methods;

public class CheckEven {

	public static void main(String[] args) {
		boolean res = even(1000001);
		System.out.println(res);
	}

	private static boolean even(int i) {
		if(i%2==0) {
			return true;
		}
		return false;
	}

}
