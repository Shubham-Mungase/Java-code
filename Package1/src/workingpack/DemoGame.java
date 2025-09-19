package workingpack;

import java.util.Scanner;

import game.Indoor;
import game.OutDoor;

public class DemoGame {
	
	public static void main(String[] args) {
		
		int in,on,choice;
		Scanner sc=new Scanner(System.in);
		String pname,gname;
		Indoor in1[]=null;
		OutDoor out1[]=null;
		
		do
		{
			System.out.println("1->Enter info of Indoor");
			System.out.println("2->Enter info of OutDoor");
			System.out.println("3->Display info of Indoor");
			System.out.println("4->Display info of Outdoor");
			System.out.println("5->Exit");
			System.out.println("Enter Choice ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("How many player :");
				in=sc.nextInt();
				in1=new Indoor[in];
				for(int i=0;i<in;i++)
				{
					in1[i]=new Indoor();
					System.out.println("Enter Player name :");
					pname=sc.next();
					System.out.println("Enter Game name :");
					gname=sc.next();
					in1[i]= new Indoor(pname,gname);
				}
				break;
				
			case 2:
				System.out.println("How many player :");
				on=sc.nextInt();
				out1=new OutDoor[on];
				for(int i=0;i<on;i++)
				{
					out1[i]=new OutDoor();
					System.out.println("Enter Player name :");
					pname=sc.next();
					System.out.println("Enter Game name :");
					gname=sc.next();
					out1[i]= new OutDoor(pname,gname);
				}
				break;
			case 3:
				System.out.println("Info of Indoor player =");
				for(int i=0;i<in1.length;i++)
				{
					System.out.println(""+in1[i]);
				}
				break;
			case 4:
				System.out.println("Info of Outdoor player =");
				for(int i=0;i<out1.length;i++)
				{
					System.out.println(""+out1[i]);
				}
				break;
			case 5:
				break;
			}
		}while(choice!=5);
		
	}

}
