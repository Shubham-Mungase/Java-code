package hashset;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetSearch {
	public static void main(String[] args) {
		TreeSet<Integer> tree=new TreeSet<Integer>();
		Scanner sc=new Scanner(System.in);
		int[] arr= {10,20,60,30,90,88,33,22,24};
		for(int i=0;i<arr.length;i++)
		{
			tree.add(new Integer(arr[i]));
		}
		System.out.println("Output=");
		System.out.println("First="+tree.first());
		System.out.println("Last="+tree.last());
		if(tree.contains(new Integer(110)))
		{
			System.out.println("Present");
		}
		else
		{
			System.out.println("Not Present");
		}
	}
}
