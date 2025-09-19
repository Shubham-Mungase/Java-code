package day6;

import java.io.Serializable;
import java.util.Scanner;

public class Studentnew1 implements Serializable{

	int rno;
	String name;
	float per;
	public void set() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll no =");
		rno=sc.nextInt();
		System.out.println("Enter Name =");
		name=sc.next();
		System.out.println("Enter per =");
		per=sc.nextFloat();	
	}

	public void show() {
		System.out.println("Roll no="+rno);
		System.out.println("Name ="+name);
		System.out.println("Percentage ="+per);
	}

}
