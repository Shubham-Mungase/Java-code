package arrays;

import java.util.Scanner;

public class DeleteElement {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Element :");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter The Elements:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter The Index of Element Which You Want to delete");
		int pos=sc.nextInt();
		if(pos<0 || pos>size-1)
		{
			System.out.println("Invalid Index");
		}
		else
		{
		for(int i=pos-1;i<size-1;i++)
		{
			arr[i]=arr[i+1];
		}
		size--;
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}}
		
	}
}
