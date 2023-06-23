package basicprograms;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {

		int[] a= {1,6,3,5,4,7,6};
		System.out.println(Arrays.toString(a));
		int max=a[0];
		int steps=4;
		int sum=0;
		int[] b=new int[a.length];
		int[] c=new int[a.length];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
			sum=sum+a[i];
			//forward rotation i.e moving elements forward
			b[(i+steps)%a.length]=a[i];
			//moving elements left
			c[i]=a[(i+steps)%a.length];
			
		}
		//sort
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		}
			System.out.println(Arrays.toString(a));
		System.out.println(max);
		
		for(int i=0;i<a.length;i++) {
			
		}
		
		
		System.out.println(sum);
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		
		
		

	}

}
