package basicprograms;

import java.util.Stack;

public class MatchedParenthesis {
	
	
	static boolean checkMatchedParenthesis(String str){
		
		Stack<Character> st=new Stack();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='{'||str.charAt(i)=='('||str.charAt(i)=='[')
				{st.push(str.charAt(i));
				continue;
			
				}else {
				if(st.isEmpty()) {
					System.out.println("0");
					return false;}
				if(str.charAt(i)=='}' && st.pop()=='{'||str.charAt(i)==')'&& st.pop()=='('||str.charAt(i)==']'&& st.pop()=='[')
			       continue; 
				else {
					System.out.println("1");
					return false;}
		}}
		if(st.isEmpty()) 
			return true;
		else {
			System.out.println("2");
			return false;
		}
	}

	public static void main(String[] args) {
		
		String s="{}()[]";
		if(checkMatchedParenthesis(s))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}

	
}
