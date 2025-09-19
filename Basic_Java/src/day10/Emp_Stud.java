package day10;

import java.util.Scanner;

//create a class Person has members (name,address,phono).from this class deriverd two classes Emp(eno,salary) and student (rollno ,per).
public class Emp_Stud {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee e=null;
		Student s=null;
		int choice;
		do {
			System.out.println("1->Read Info Emp");
			System.out.println("2->Read Info Stud");
			System.out.println("3->Display Info Emp");
			System.out.println("4->Display Info Stud");
			System.out.println("5->Exit");
			System.out.println("Enter Choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				/*System.out.println("Enter Emp no :");
				e.setEno(sc.nextInt());
				System.out.println("Enter Emp Name :");
				e.setName(sc.next());
				System.out.println("Enter Emp Address :");
				e.setAddress(sc.next());
				System.out.println("Enter Emp Phone No :");
				e.setPhno(sc.nextLong());
				System.out.println("Enter Emp Salary :");
				e.setSalary(sc.nextInt());*/
				
				System.out.println("Enter Emp no :");
				int eno=sc.nextInt();
				System.out.println("Enter Emp Name :");
				String name=sc.next();
				System.out.println("Enter Emp Address :");
				String addr=sc.next();
				System.out.println("Enter Emp Phone No :");
				long phno=sc.nextLong();
				System.out.println("Enter Emp Salary :");
				int sal=sc.nextInt();
				e=new Employee(name,addr,phno,eno,sal);
				
				break;
			case 2:
				/*System.out.println("Enter Student roll No");
				s.setRollno(sc.nextInt());
				System.out.println("Enter Student Name :");
				s.setName(sc.next());
				System.out.println("Enter Student  Address :");
				s.setAddress(sc.next());
				System.out.println("Enter Student  Phone No :");
				s.setPhno(sc.nextLong());
				System.out.println("Enter Student Percenatge :");
				s.setPer(sc.nextInt());*/
				
				System.out.println("Enter Student rollno :");
				int rno=sc.nextInt();
				System.out.println("Enter Student Name :");
				String sname=sc.next();
				System.out.println("Enter Student Address :");
				String saddr=sc.next();
				System.out.println("Enter Student Phone No :");
				long sphno=sc.nextLong();
				System.out.println("Enter Stuent Percenatge :");
				int per=sc.nextInt();
				s=new Student(sname,saddr,sphno,rno,per);
				break;
			case 3:
				System.out.println(e.toString());
				break;
			case 4:
				System.out.println(s.toString());
			case 5:
				break;
				
			}
		}while(choice!=5);
				
	}
}
