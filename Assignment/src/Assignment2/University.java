package Assignment2;

import java.util.Scanner;

public class University {
	
	static class Department
	{
		String name;
		int fno;
		public Department(String name, int fno) {
			super();
			this.name = name;
			this.fno = fno;
		}
		
		public String displayInfo() {
			return "Department [name=" + name + ", fno=" + fno + "]";
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name of dept :");
		String name=sc.next();
		System.out.println("Enter Faculty Number :");
		int fno=sc.nextInt();
		Department d=new Department(name, fno);
		System.out.println(" Info ="+d.displayInfo());
	}

}
