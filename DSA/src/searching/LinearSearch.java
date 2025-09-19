package searching;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		LinearSearch ls=new LinearSearch();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How Many Element :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter The Elements :");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter The Element To Be Search :");
		int key=sc.nextInt();
		int pos=ls.linearSearch(arr,n,key);
		if(pos!=-1)
		{
			System.out.println("Element Present At "+pos);
		}
		else
		{
			System.out.println("Element Is Not Present");
		}
	}

	private int linearSearch(int[] arr, int n,int key) {
		boolean flag=false;
		int i;
		for(i=0;i<n;i++)
		{
			if(arr[i]==key)
			{
				flag=true;
			}
		}
		if(flag)
			return i;
		return -1;
	}
}
