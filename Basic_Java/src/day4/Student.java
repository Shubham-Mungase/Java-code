package day4;

import java.util.Scanner;

public class Student {
	private int rollno;
	private String name;
	private float per;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int rollno, String name, float per) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.per = per;
	}


	


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getPer() {
		return per;
	}


	public void setPer(float per) {
		this.per = per;
	}	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", per=" + per + "]";
	}
	private void readStudent() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student rollno :");
		rollno=sc.nextInt();
		System.out.println("Enter Student Name :");
		name=sc.next();
		System.out.println("Enter Student Percentage :");
		per=sc.nextFloat();	
	}

	public static void main(String[] args) {
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How many student :");
		n=sc.nextInt();
		Student s[]=new Student[n];
		System.out.println("Enter info of student :");
		for(i=0;i<n;i++)
		{
			s[i]=new Student();
			s[i].readStudent();
		}
		for(i=0;i<n;i++)
		{
			System.out.println(s[i].toString());
		}
		for(Student v:s)
		{
			System.out.println(v.toString());
		}
	}


	
}
