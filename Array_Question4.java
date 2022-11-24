
public class Array_Question4 {

	public static void main(String[] args) {
		int[] arr= {52,9,4,6,8,3,1};
		int n=arr.length;
		
		mergeSort(arr,0,n-1);
		
		for(int x:arr) {
			System.out.print(x+" ");
		}


	}
	static void mergeSort(int[] arr,int low,int high) {
		if(low<high) {
			
			int mid=(low+high)/2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
	}
	static void merge(int arr[], int low, int mid, int high)
    {
        
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];
 
        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[low + i];
        for (int j = 0; j < n2; ++j)
            rightArr[j] = arr[mid + 1 + j];

        int i = 0,j = 0;
        int k=low;
        
        while (i < n1 && j < n2) {
            if (leftArr[i] < rightArr[j]) {
                arr[k++] = leftArr[i++];
            }
            else {
                arr[k++] = rightArr[j++];
            }
        }
 
        while (i < n1) {
           arr[k++] = leftArr[i++];
        }
        while (j < n2) {
            arr[k++] = rightArr[j++];
        }
    }
}
