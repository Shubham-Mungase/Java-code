package linkedList;

import java.util.Scanner;

public class SearchNode {
	Node head;
	public void insert(int data)
	{
		Node newNode= new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		Node current=head;
		
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=newNode;
	}
	
	public void display()
	{
		Node current=head;
		if(head==null)
		{
			System.out.println("List is empty");
		}
		while(current.next!=null)
		{
			System.out.print(current.data+"\t");
			current = current.next;
		}
		
	}
	public int search(int key)
	{
		Node current=head;
		int pos=1;
		if(head==null)
			System.out.println("List is empty");
		while(current.next!=null)
		{
			if(current.data==key)
			{
				return pos;
			}
			current=current.next;
			pos++;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		SearchNode sn=new SearchNode();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Nodes :");
		while(true)
		{
			System.out.println("Enter the Node Data :");
			int data=sc.nextInt();
			sn.insert(data);
			System.out.println("Do you want to continue then press 'y':");
			String str=sc.next();
			if(str.equals("y"))
				continue;
			else
				break;
		}
		sn.display();
		System.out.println("\n\nEnter The Element to be Search :");
		int key=sc.nextInt();
		int pos=sn.search(key);
		if(pos==0)
		{
			System.out.println("Element is not present");
		}
		else
		{
			System.out.println("Element is present at = "+pos);
		}
		
		
	}
	
}
