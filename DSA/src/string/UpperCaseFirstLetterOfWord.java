package string;

public class UpperCaseFirstLetterOfWord {

	public static void main(String[] args) {
		String sen = "hi,  i am sunil  ";
		StringBuilder sb=new StringBuilder();
		
		sb.append(Character.toUpperCase(sen.charAt(0)));
		
		for(int i=1; i<sen.length(); i++) {
			if(sen.charAt(i-1)==' ') {
				sb.append(Character.toUpperCase(sen.charAt(i)));
			}else {
				sb.append(sen.charAt(i));				
			}
		}
		
		System.out.println(sb);
	}

}
