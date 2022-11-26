//3. WAP to check if “2552” is palindrome or not.

public class String_Question3 {

	public static void main(String[] args) {

		String s="2552";
		
		
		boolean flag=true;
		for(int i=0,j=s.length()-1;i<j;i++,j--) {
			if(s.charAt(i)!=s.charAt(i)) {
				flag=false;
			}
		}
		if(flag==true)
			System.out.println("Given string is palindrome");
		else
			System.out.println("Given string is not palindrome");

	}

}
