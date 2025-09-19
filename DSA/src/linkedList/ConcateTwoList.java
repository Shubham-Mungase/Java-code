package linkedList;

import java.util.Scanner;

public class ConcateTwoList extends LinkedList{
	
	public void concateList(ConcateTwoList list2)
	{
		Node list1=head;
		while(list1!=null)
		{
			
			list1=list1.next;
		}
		list1.next=list2.head;
	}

	public static void main(String[] args) {
		ConcateTwoList ctl[]=new ConcateTwoList[2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Elements :");
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter The List Number : "+i);
			while(true)
			{
				String str;
				System.out.println("Enter The Element :");
				int val=sc.nextInt();
				ctl[i]=new ConcateTwoList();
				ctl[i].insert(val);
				System.out.println("Do you want to contine Then Press 'y' :");
				str=sc.next();
				if(str.equalsIgnoreCase("y"))
					continue;
				else
					break;
			}
			
		}
		ctl[0].concateList(ctl[1]);
		
	}
}
