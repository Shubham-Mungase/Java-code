package Assignment2;

import java.util.Scanner;

public class Addition2 {

	public void addTwoArray(int arr[],int brr[],int num)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Element of First Array :");
		for(int i=0;i<num;i++)
		{
			
				arr[i]=sc.nextInt();
		}
		System.out.println("Enter The Element of Second Array :");
		for(int i=0;i<num;i++)
		{
				brr[i]=sc.nextInt();
	    }
		int crr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			crr[i]=arr[i]+brr[i];
		}
		for(int i=0;i<num;i++)
		{
			System.out.print(crr[i]+"\t");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Addition2 a2=new Addition2();
		System.out.println("How Many Rows :");
		int num=sc.nextInt();
		int arr[]=new int[num];
		int brr[]=new int[num];
		a2.addTwoArray(arr,brr,num);
		
		
	}
	
}
