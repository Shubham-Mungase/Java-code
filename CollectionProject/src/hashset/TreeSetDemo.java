package hashset;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> tree=new TreeSet<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 Tree Values");
		for(int i=0;i<10;i++)
		{
			int n=sc.nextInt();
			tree.add(new Integer(n));
		}
		System.out.println("Output=");
		Iterator it=tree.iterator();
		while(it.hasNext())
		{
			Integer no=(Integer) it.next();
			System.out.println(no);
		}

	}

}
