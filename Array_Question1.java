
public class Array_Question1 {

	public static void main(String[] args) {

		int[] arr= {2,4,7,4,5,2,8,9,6,7,10};
		
		System.out.print("Duplictes are: ");
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}

	}

}
