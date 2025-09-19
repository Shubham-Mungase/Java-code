package searching;

import java.util.Scanner;

public class BinarySearch {
	
	private static int binary_search(int[] arr, int n, int key) {
		int left=0;
		int right=n-1;
		while(left<=right)	
		{
			int mid=(left+right)/2;
			if(key==arr[mid])
			{
				return mid;
			}
			else if(key<arr[mid])
			{
				right=mid-1;
			}
			else
			{
				left=mid+1;
			}
		}
		return -1;
	}

	private static int[] bubble_sort(int[] arr, int n) {
		// TODO Auto-generated method stub
		int temp;
		for(int i=0;i<n-1;i++)
		{
			boolean flag=false;
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
			if(flag==false)
			break;
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How Many Element You Want :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int brr[];
		System.out.println("Enter The Element :");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		brr=bubble_sort(arr,n);
		System.out.println("Sorted Elements:");
		for(int i=0;i<n;i++)
		{
			System.out.println(brr[i]);
		}
		
		System.out.println("Enter the Element to be Search :");
		int key=sc.nextInt();
		int pos=binary_search(brr,n,key);
		if(pos!=-1)
		{
			System.out.println("Element Present at "+(pos+1));
		}
		else
		{
			System.out.println("Element is not present");
		}
	}

}

	
	
	

