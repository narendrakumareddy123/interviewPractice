package basicprograms;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapFrequentElemArraString {

	public static void main(String[] args) {
		Map<Integer,Integer> nums=new HashMap<>();
		Map<String,Integer> strings=new HashMap<>();
		int arr[]= {20,30,60,20,60,30,35,20,60};
		String sentence="My name is Narendra is is is my correct Narendra Nrendra my";
		String[] words=sentence.split(" ");
		/*
		 * for(int i=0;i<words.length;i++) { System.out.println(words[i]); }
		 */
		for(int i=0;i<arr.length;i++) {
			
			if(!nums.containsKey(arr[i]))
				nums.put(arr[i], 1);
			else
				nums.put(arr[i], nums.get(arr[i])+1);		
		}
		/* System.out.println(nums); */
		//using iterator
		for(Integer i:nums.keySet()) {
			System.out.println(i+" "+nums.get(i));
		}
for(int i=0;i<words.length;i++) {
			
			if(!strings.containsKey(words[i]))
				strings.put(words[i], 1);
			else
				strings.put(words[i], strings.get(words[i])+1);		
		}
		System.out.println(strings);
		int maxwords=Collections.max(strings.values());
		//using iterator
		for(String i:strings.keySet()) {
			
			System.out.println(i+" "+strings.get(i));
			if(maxwords==strings.get(i))
				System.out.println(i+"Most repeated string"+maxwords);
				
		}
		/* int maxnum = Collections.max(nums.values()) */;/*
													 * int maxwords=Collections.max(strings.values());
													 */
		
		
		
		
		
		
		
		
	
	}

}
