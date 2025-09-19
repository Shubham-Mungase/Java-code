package arrays;

import java.util.Scanner;

public class InsertionOfElement {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[50];
		System.out.println("How many element :");
		int size=sc.nextInt();
		if(size>5)
		{
			System.out.println("Array Index Out Of Bound");
		}
		else {
		System.out.println("Length="+arr.length);
		System.out.println("Enter The Array Element :");
		for(int i=0;i<=size-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		
		System.out.println("Enter The Element To be Insert :");
		int ele=sc.nextInt();
		System.out.println("Enter The Index Number Where you want to Insert The Element :");
		int pos=sc.nextInt();
		
		for(int i=size-1;i>=pos-1;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[pos-1]=ele;
		size++;
		
		for(int i=0;i<=size-1;i++)
		{
			System.out.println(arr[i]);
		}
		}
		
	}

}
