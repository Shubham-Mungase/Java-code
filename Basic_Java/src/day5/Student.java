package day5;

import java.util.Scanner;

public class Student {
	private int rollno;
	private String name;
	private float per;
	public Student() 
	{
		super();
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
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Student :");
		int n=sc.nextInt();
		Student s[]=new Student[n];
		System.out.println("Enter info of student :");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter roll no:");
			int vrollno=sc.nextInt();
			System.out.println("Enter Name:");
			String vname=sc.next();
			System.out.println("Enter Percentage:");
			float vper=sc.nextFloat();
			s[i]=new Student(vrollno,vname,vper);
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(s[i]);
		}
		for(Student v:s)
		{
			System.out.println(v);
		}
	}
	

}
