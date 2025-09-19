package day12;

import java.util.Scanner;

public class ShapeDemo {
	
	
	public static void main(String[] args) {
		
		Circle c=new Circle();
		Rect r=new Rect();
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("1->Area of circle");
			System.out.println("2->Volume of circle");
			System.out.println("3->Area of Rect");
			System.out.println("4->Volume of Rect");
			System.out.println("5->Area of circle");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter Radius =");
				c.setRadius(sc.nextFloat());
				c.area();
				System.out.println("Area Of circle ="+c.getArea());
				break;
			case 2:
				System.out.println("Enter Radius =");
				c.setRadius(sc.nextFloat());
				c.volume();
				System.out.println("Volue Of circle ="+c.getVolume());
				break;
			case 3:
				System.out.println("Enter Length =");
				r.setL(sc.nextFloat());
				System.out.println("Enter Breadth =");
				r.setB(sc.nextFloat());
				r.area();
				System.out.println("Area of React ="+r.getA());
				break;
			case 4:
				System.out.println("Enter Length =");
				r.setL(sc.nextFloat());
				System.out.println("Enter Breadth =");
				r.setB(sc.nextFloat());
				System.out.println("Enter Height =");
				r.setH(sc.nextFloat());
				r.volume();
				System.out.println("Volume of React="+r.getV());
				break;
			case 5:
				break;
			}
			
		}while(choice!=5);
	}

}
