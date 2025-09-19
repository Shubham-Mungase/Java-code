package arrays;

import java.util.Scanner;

public class ReverseArray1 {

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
		int lw=0;
		int up=arr.length-1;
		int temp;
		//System.out.println("up="+up);
		for(int i=0;i<arr.length;i++)
		{
			if(lw==up)
			{
				break;
			}
			else
			{
				temp=arr[lw];
				arr[lw]=arr[up];
				arr[up]=temp;
				lw++;
				up--;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("\t"+arr[i]);
		}
	}
}
