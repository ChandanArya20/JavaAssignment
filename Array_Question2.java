
public class Array_Question2 {
	public static void main(String[] args) {
		int[] arr= {52,9,4,6,8,3,1};
		int n=arr.length;
		
		quickSort(arr,0,n-1);
		
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}
	static void quickSort(int[] arr, int low,int high) {
		
		if(low<high) {
			
			int pix=partition(arr,low,high);
			quickSort(arr,low,pix-1);
			quickSort(arr,pix+1,high);
		}
	}
	static int partition(int[] arr,int low,int high) {
		
		int pivot=arr[low];
		int i=low;
		int j=high;
		
		while(i<j) {
			
			while(i<=high && arr[i]<=pivot) {
				i++;
			}
			while(j>=low && arr[j]>pivot) {
				j--;
			}
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		int temp=arr[low];
		arr[low]=arr[j];
		arr[j]=temp;
		
		return j;
	}
}
