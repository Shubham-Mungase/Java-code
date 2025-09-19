package sorting;

import java.util.Scanner;

public class BubbleSort {
	
	private static void bubble_sort(int[] arr, int n) {
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
		System.out.println("The Sorted Array:");
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n;
		int arr[];
		System.out.println("Enter How Many Element :");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter the number :");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		bubble_sort(arr,n);
	}

	
}
