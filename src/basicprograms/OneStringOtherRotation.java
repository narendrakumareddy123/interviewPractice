package basicprograms;
class OneStringOtherRotation{
	public static void main(String[] args) {
		String str="abcd";
		String rot="bdac";
		String concatstr=str.concat(str);
		if(concatstr.indexOf(rot)!=-1)
			System.out.println("rotated String");
		else
			System.out.println("different");
	}

	}


