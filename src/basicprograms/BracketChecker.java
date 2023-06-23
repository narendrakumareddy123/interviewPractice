package basicprograms;

import java.util.Stack;

public class BracketChecker {
	
	public static boolean checker(String str) {
		
		Stack<Character> s=new Stack();
		
		char[] brackets=str.toCharArray();
		for(char c:brackets) {
			if(c=='{'||c=='['||c=='(')
				s.push(c);
			else if(s.isEmpty()) {
				System.out.println("here");
				return false;}
			else {
				char top=s.pop();
				if(c=='}'&&top!='{'||c==']'&&top!='['||c==')'&&top!='(')
					return false;
			}
			
		}
		
		if(s.isEmpty())
			return true;
		else
			return false;
		
	}

	public static void main(String[] args) {
		
		String str="}[]}{}()(){}";
		boolean result=checker(str);
		if(result)
			System.out.println("Matched");
		else
			System.out.println("Unmatched");

	}

}
