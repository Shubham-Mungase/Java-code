package arrays;

public class MaxElement {
	
	public static void main(String[] args) {
		int arr[]= {2,3,4,8,5,6};
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum ="+max);
	}

}
