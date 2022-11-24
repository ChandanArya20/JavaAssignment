
public class Array_Question6 {

	public static void main(String[] args) {
	
		int[] arr1= {12,45,89,90,3,4,6,2};
		int[] arr2= {4,12,4};
		
		boolean flag=false;
		for(int i=0;i<arr2.length;i++) {
			flag=false;
			for(int j=0;j<arr1.length;j++) {
				if(arr2[i]==arr1[j]) {
					flag=true;
				}
			}
			if(flag==false)
				break;
		}
		if(flag==true)
			System.out.println("Array-2 is subset of array-1");
		else
			System.out.println("Array-2 is not subset of array-1");
	}
}
