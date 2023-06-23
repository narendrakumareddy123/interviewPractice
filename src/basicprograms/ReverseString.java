package basicprograms;

public class ReverseString {

	static String reverse(String str) {
		if(str.isEmpty()) {
			return str;
		}
		else 
		return reverse(str.substring(1))+str.charAt(0);	
	}
	
	public static void main(String[] args) {
		String original="Narendra";
		String rev=reverse(original);
		System.out.println(rev);
		
	}

}
