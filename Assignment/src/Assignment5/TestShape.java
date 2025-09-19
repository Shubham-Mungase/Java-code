package Assignment5;

import java.util.Scanner;

public class TestShape {
	public static void main(String[] args) {
		Shape[] shape=new Shape[50];
		Scanner sc=new Scanner(System.in);
		int choice,index=0;
		do
		{
			System.out.println("1.Area of Circle");
			System.out.println("2.Area of Square");
			System.out.println("3.Area of Reacangle");
			System.out.println("4.Area of Cylinder");
			System.out.println("5.Display The result");
			System.out.println("6.Exit");
			System.out.println("Enter Choice :");
			choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			shape[0]=new Circle();
			System.out.println("Enter The Radius :");
			((Circle )shape[0]).setRadius(sc.nextFloat());
			index++;
			break;
		case 2:
			shape[1]=new Square();
			System.out.println("Enter The Side :");
			((Square)shape[1]).setSide(sc.nextFloat());
			index++;
			break;
		case 3:
			shape[2]=new Rectangle();
			System.out.println("Enter The Length :");
			((Rectangle)shape[2]).setLength(sc.nextFloat());
			System.out.println("Enter The Breadth :");
			((Rectangle)shape[2]).setBreadth(sc.nextFloat());
			index++;
			break;
		case 4:
			shape[3]=new Cylinder();
			System.out.println("Enter The Radius :");
			((Cylinder)shape[3]).setRadius(sc.nextFloat());
			System.out.println("Enter The Height :");
			((Cylinder)shape[3]).setHeight(sc.nextFloat());
			index++;
			break;
		case 5:
			System.out.println("Area of The Shapes =\n");
			for(int i=0;i<index;i++)
			{
				shape[i].area();
			}
			
		}
		}while(choice!=6);
		
	}


}
