package sorting;

import java.util.Scanner;

public class Insertion_Sort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter How Many Element :");
		n=sc.nextInt();
		int arr[]=new int[n];
		int brr[];
		System.out.println("Enter The '"+n+"' Elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		brr=insertion_sort(arr,n);
		System.out.println("Sorted Array :");
		for(int i=0;i<n;i++)
		System.out.println(brr[i]);
		
	}

	private static int[] insertion_sort(int[] arr, int n) {
		int temp;
		for(int i=1;i<n;i++)
		{
			
			temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		
//		System.out.println("Sorted array =");
//		for(int i=0;i<n;i++)
//		{
//			System.out.println(arr[i]);
//		}
		return arr;
	}

}
