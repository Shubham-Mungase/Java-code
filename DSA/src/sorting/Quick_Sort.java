package sorting;

import java.util.Scanner;

public class Quick_Sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter How Many Element You Want  :");
		n=sc.nextInt();
		int arr[]=new int[n];
		int brr[];
		System.out.println("Enter The Element :");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		brr=quickSort(arr,0,n-1);
		for( int i=0;i<n;i++)
		{
			System.out.println("\t"+brr[i]);
		}
	}

	private static int[] quickSort(int[] arr, int lb, int ub) {
		int loc;
		if(lb<ub)
		{
		loc=partition(arr,ub,lb);
		quickSort(arr,lb,loc-1);
		quickSort(arr,loc+1,ub);
		}
		return arr;
		
	}

	private static int partition(int[] arr, int lb, int ub) {
		int start=lb;
		int end=ub;
		int temp;
		int pivot=arr[lb];
		while(lb<ub)
		{
			while(arr[start]<=pivot && start<end)
			{
				start++;
			}
			while(arr[end]>pivot)
			{
				end--;
			}
			if(start<end)
			{
				temp=arr[start];
				arr[start]=arr[end];
				arr[end]=arr[start];
			}
			
		}
		arr[lb]=arr[ub];
		arr[ub]=pivot;
		
		return ub;
		
	}
	
}
