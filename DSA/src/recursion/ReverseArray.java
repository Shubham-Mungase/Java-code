package recursion;

public class ReverseArray {
	
	public static void main(String[] args) {
		ReverseArray ra=new ReverseArray();
		int arr[]= {1,2,3,4,5,6,7};
		int len=arr.length-1;
		ra.reverse(0,len,arr);
		for(int i=0;i<=len;i++)
		{
			System.out.println(arr[i]+"\t");
		}
	}

	private void reverse(int i, int len, int[] arr) {
		
		if(i>=len)
			return;
		swap(arr,i,len);
		reverse(i+1,len-1,arr);
		
	}

	private void swap(int[] arr, int i, int j) {
		int temp=0;
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;	
	}

}
