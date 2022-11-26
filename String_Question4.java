//4. WAP to count the number of consonants, vowels, special characters in a String.

public class String_Question4 {

	public static void main(String[] args) {

		String s="do you like apple,banana and milk?";

		
		int cCount=0,vCount=0,sCount=0;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||
			   s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' ||
			   s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' ||
			   s.charAt(i)=='U') {
				
				vCount++;
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' &&
					s.charAt(i)<='Z') {
				
				cCount++;
			}
			else
				sCount++;
			
				
		}
		
		System.out.println("No. of vowel: "+vCount);
		System.out.println("No. of consonanat: "+cCount);
		System.out.println("No. of special character: "+sCount);
	}

}
