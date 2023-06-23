package basicprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;

public class IntegerMethods {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("removal")
		Integer obj=new Integer(10);
		System.out.println(obj);
		
		System.out.println(Integer.valueOf(obj));
		Integer s=new Integer("6545");
		int j=s.intValue();
		System.out.println(j);
		int[] a= {1,2,3,4};
		String s1=null;
		/*
		 * Optional<Character> empty=Optional.empty(); Optional<Character>
		 * value=Optional.of(s1.charAt(2)); System.out.println(value.isPresent());
		 */
		
		List<Optional<Integer>> intList = new ArrayList<Optional<Integer>>();

		intList.add(Optional.empty());
		intList.add(Optional.of(2));
		intList.add(Optional.of(3));
		intList.add(Optional.of(4));
		System.out.println(intList);
		
		//string joiner
		 StringJoiner joinNames = new StringJoiner( ",", "]","(");   // passing comma(,) and square-brackets as delimiter   
         
	        // Adding values to StringJoiner  
	        joinNames.add("Rahul");  
	        joinNames.add("Raju");  
	        joinNames.add("Peter");  
	        joinNames.add("Raheem");  
	        System.out.println(joinNames);
	}

}
