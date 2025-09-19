package Assignment3;

import java.util.Arrays;

public class DistinctValueCount {

	public static void main(String[] args) {
		
		int arr[]= {10,30,20,10,20,30,50};
		int n=arr.length;
		int cnt=0;
		Arrays.sort(arr);
		
		//System.out.println(""+);
		for(int i=0;i<n;i++)
		{
			System.out.println("arr="+arr[i]);
			for(int j=0;j<i;j++)
			{
			if(arr[i]==arr[j]) 
			{
				cnt++;
			}
			}
				
			
		}
		System.out.println("cnt"+(n-cnt));
		
		
	}
}
