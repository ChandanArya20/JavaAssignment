import java.util.Arrays;

//8. WAP to find the maximum occurring character in a String

public class String_Question8 {

	public static void main(String[] args) {

//		String str="riya";
		String str="ramayan";
		
		
		int[] count=new int[256];
		int max=0;
		char res=' ';
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
			if(count[str.charAt(i)]>max) {
				max=count[str.charAt(i)];
				res=str.charAt(i);
			}
		}
		if(max==1)
			System.out.println("Every character is uniqe");
		else
			System.out.println("Maximum occuring character is : "+res);

	}

}
