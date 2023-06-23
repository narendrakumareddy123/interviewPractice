package basicprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayFreqcount {

	public static void main(String[] args) {
		
		
		int[] a= {1,34,20,1,1,20,20,20,34};
		
		
		for(int i=0;i<a.length;i++)
		{
			int c=1;
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					c++;
				continue;}
				
			}
			System.out.println(a[i]+" "+c);
		}
		Map<Integer,String> map=new HashMap<>();
		map.put(null, "hsvjs");
		map.put(558, "Narendra Kumar Reddy");
		map.put(556, "Narendra Kumar Reddy");
		System.out.println(map);
		
		

	}

}
