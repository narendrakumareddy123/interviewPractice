package basicprograms;

import java.util.Arrays;

public class Arraymisingelem {

	public static void main(String[] args) {
		int[] a= {1,2,4,5,8,6,3};
		Arrays.sort(a);
		 if(a[a.length-1]!=a.length+1)
			 System.out.println(a.length+1);
		 else {
		for(int i=1;i<=a.length;i++) {
			if(a[i-1]==i)
				continue;
			else
				{System.out.println(i);
			break;
			}}
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				int sum=6;
				if(sum==a[i]+a[j])
					count++;
			}	
		}
		System.out.println(count);
		
		}

	}

}
