//1. WAP to remove Duplicates from a String.(Take any String ex with duplicates
//character)

public class String_Question1 {

	public static void main(String[] args) {

		String s1="chandan";
		System.out.println("Before string: "+s1);
		
		
		String s2="";
		int i,j;
		for(i=0;i<s1.length();i++) {
			
			for(j=0;j<i;j++) {
				if(s1.charAt(i)==s1.charAt(j))
					break;
			}
			
			if(i==j) {
				s2+=s1.charAt(i);
			}
		}
		s1=s2;
		
		System.out.println("After string: "+s1);
		
	}

}
