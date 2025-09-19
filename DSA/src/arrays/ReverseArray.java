package arrays;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Element :");
		int num=sc.nextInt();
		int arr[]=new int[num];
		System.out.println("Enter The Element :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("After Reverse =");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("\t"+arr[i]);
		}
		System.out.println("After Reverse =");
	
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print("\t"+arr[i]);
		}
	}

}
