package linkedList;

import java.util.Scanner;

public class LengthOfList extends LinkedList{

	
	public void length()
	{
		Node current=head;
		int ct=0;
		while(current!=null)
		{
			ct++;
			current=current.next;
		}
		System.out.println("Length of Linked List is = "+ct);
		
	}
	public static void main(String[] args) {
		LengthOfList lol=new LengthOfList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Elements :");
		String str;
		do {
			System.out.println("Enter The Element :");
			int val = sc.nextInt();
			lol.insert(val);
			System.out.println("Do you want to continue then press y");
			str = sc.next();
		} while(str.equals("y"));
		lol.length();
		
	}
}
