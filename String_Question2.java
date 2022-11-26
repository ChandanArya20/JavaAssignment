//2. WAP to print Duplicates characters from the String.

public class String_Question2 {

	public static void main(String[] args) {

		String str="chandan";
		
		int i,j;
		System.out.println("String is - "+str);
		System.out.print("Duplicates charecter are: ");
		for(i=0;i<str.length();i++) {
			
			for(j=0;j<i;j++) {
				
				if(str.charAt(i)==str.charAt(j))
					System.out.print(str.charAt(i)+",");
			}
	
		}	
	}
}
