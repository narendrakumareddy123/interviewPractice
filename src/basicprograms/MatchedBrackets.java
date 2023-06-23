package basicprograms;

import java.util.Stack;

public class MatchedBrackets {
	
	private static boolean matched(String str) {
		
		
		if(str.length()==0 || str==null)
			return false;
		else {
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<str.length();i++) {
			
			char c=str.charAt(i);
			
			if(c=='{'||c=='[' || c=='(') {
				stack.push(c);
			    continue;
			}
			else {
				
				if(stack.isEmpty()) {
					System.out.println("First char is closed one");
					return false;	
				}
					
				else {
					char top=stack.peek();
					if(c=='}'&& top=='{'||c==')'&& top=='('||c==']'&& top=='[') {
						stack.pop();	
						continue;
						}
					else {
						System.out.println("Unmatched");
						return false;
					}
				
				if(stack.isEmpty()) {
					System.out.println("All matched stack emptied");
					return true;
				}
				else
					return false;	
			
		}
		}
			return false;
	}

		
		
		
	

	public static void main(String[] args) {
		
String s="{{}}";
matched(s));
	}

}
