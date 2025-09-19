package linkedList;

import java.util.Scanner;

public class EvenNumber extends LinkedList{

	public void evenNumber()
	{
		Node current=head;
		while(current!=null)
		{
			if(current.data%2==0)
			{
				System.out.print("\t"+current.data);
			}
			current=current.next;
		}
	}
	
	public static void main(String[] args) {
		EvenNumber en=new EvenNumber();
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Elements :");
		String str;
		do {
			System.out.println("Enter The Element :");
			int val = sc.nextInt();
			en.insert(val);
			System.out.println("Do you want to continue then press y");
			str = sc.next();
		} while(str.equals("y"));
		en.evenNumber();
	}
}
