//6. WAP to implement Pangram Checking with least inbuilt methods being used.

public class String_Question6 {

	public static void main(String[] args) {
		
		String str=" the quick brown fox jumps over the lazy dog";
		
		
		int[] flag=new int[26];
		boolean check=true;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
				flag[str.charAt(i)-65]++;
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
				flag[str.charAt(i)-97]++;
		}
		
		for(int i=0;i<flag.length;i++) {
			if(flag[i]==0) {
				check=false;
				break;
			}
		}
		if(check==true)
			System.out.println("String is pangram");
		else
			System.out.println("String is not pangram");
	}

}