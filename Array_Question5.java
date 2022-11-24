
public class Array_Question5 {

	public static void main(String[] args) {
		int[] arr = {23,45,11,10,76,89,34,21};
		
		for(int i=0;i<arr.length;i++) {
			int min=i;
			int x=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[x];
			arr[x]=arr[min];
			arr[min]=temp;
		}
		
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}

}
