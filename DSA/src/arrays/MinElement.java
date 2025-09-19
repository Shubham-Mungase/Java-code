package arrays;

public class MinElement {
	public static void main(String[] args) {
		int arr[]= {1,3,0,5,3,9,-1};
		int min=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum ="+min);
	}

}
