package day11;

import java.util.Scanner;

//create Abstract class shape having abstract method area and volume. Derived Circle and ReactAngle class from shape class
public class AbstMain {
	public static void main(String[] args) {
		
		int choice;
		Circle c=new Circle();
		ReactAngle r=new ReactAngle();
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1->Area of circle");
			System.out.println("2->Area of ReactAngle");
			System.out.println("3->Exit");
			System.out.println("Enter Your Choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter Radius :");
				c.setRadius(sc.nextFloat());
				c.area();
				System.out.println("Radius ="+c.getArea());
				break;
			case 2:
				System.out.println("Enter Length :");
				r.setL(sc.nextFloat());
				System.out.println("Enter Breadth :");
				r.setB(sc.nextFloat());
				System.out.println("Enter Height :");
				r.setH(sc.nextFloat());
				r.area();
				r.volume();
				System.out.println("Area of React Angle ="+r.getArea());
				System.out.println("Voulume Of React Angle ="+r.getVolume());
				break;
			case 3:
			break;
			}
		}while(choice!=3);
	}

}
