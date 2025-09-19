package linkedList;

import java.util.Scanner;

class Node1{
	int data;
	String name;
	Node1 next;
	public Node1(int data, String name) {
		super();
		this.data = data;
		this.name = name;
		this.next = null;
	}
	
}
class LinkedList1
{
	Node1 head;
	public void insert(int data,String name)
	{
		Node1 newNode=new Node1(data,name);
		if(head==null)
		{
			head=newNode;
			return;
		}
		Node1 last=head;
		while(last.next!=null)
		{
			last=last.next;
		}
		last.next=newNode;
	}
	
	
	public int sum()
	{
		int sum=0;
		Node1 ele=head;
		while(ele!=null)
		{
			sum+=ele.data;
			ele=ele.next;
		}
		return sum;
	}
	
	public void display()
	{
		Node1 temp=head;
		while(temp!=null)
		{
			System.out.print("| "+temp.data+"="+temp.name+"|->");
			temp=temp.next;
			if(temp==null)
			{
				System.out.println("Null");
			}
		}
		
	}
	
	public void readInfo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Data Number :");
		int data=sc.nextInt();
		System.out.println("Enter The Name :");
		String name=sc.next();
		insert(data, name);
	}
}

public class AdditionOfElements {
	public static void main(String[] args) {
		LinkedList1 li=new LinkedList1();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do
		{
			li.readInfo();
			System.out.println("Do you want to add more Element \n if Yes Then Press 1 \n if No then Press 0 :");
			choice=sc.nextInt();
		}while(choice!=0);
		System.out.println("Sum="+li.sum());
		li.display();
	}

	}

