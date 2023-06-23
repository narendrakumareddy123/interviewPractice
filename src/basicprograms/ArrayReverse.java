package basicprograms;

public class ArrayReverse {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		
		
		int len=a.length;
		for(int i=0;i<len/2;i++) {
			int temp=a[i];
			a[i]=a[len-i-1];
			a[len-i-1]=temp;
		}
		
		for(int i=0;i<len;i++) {
		System.out.println(a[i]);}

	}

}
