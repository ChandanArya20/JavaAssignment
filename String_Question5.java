//5. WAP to implement Anagram Checking least inbuilt methods being used

public class String_Question5 {

	public static void main(String[] args) {

		String s1="listen";
		String s2="silent";
		
//		s1=s1.replace(" ","").toLowerCase();  // when string input is not 											  
//		s2=s2.replace(" ","").toLowerCase();  // in our control, that time we can use it
		
		boolean flag=true;
		int[] count= new int[256];
		
		if(s1.length()!=s2.length())
			flag=false;
		else {
			for(int i=0;i<s1.length();i++){
				count[s1.charAt(i)]++;
				count[s2.charAt(i)]--;		
			}
		}
		
		for(int i=0;i<count.length;i++) {
			if(count[i]!=0)
				flag=false;
		}
	
		if(flag==true)
			System.out.println("strings are anagram");
		else
			System.out.println("strings are not anagram");
	}
}
