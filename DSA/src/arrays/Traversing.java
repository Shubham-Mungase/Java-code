package arrays;

import java.util.Scanner;

public class Traversing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Element :");
		int num=sc.nextInt();
		int arr[]=new int[num];
		System.out.println("Enter The Element of Array :");
		for(int i=0;i<=num-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<=num-1;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
