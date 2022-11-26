//WAP to find if String contains all unique characters.

public class String_Question7 {

	public static void main(String[] args) {

		String str="riya";
		
		boolean flag=true;
		for(int i=0;i<str.length()-1;i++) {
			
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j))
					flag=false;
			}
		}
		if(flag==true)
			System.out.println("string has all unique character");
		else
			System.out.println("string doen't have all unique character");

	}

}
