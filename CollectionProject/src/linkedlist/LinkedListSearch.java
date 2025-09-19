package linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

import arraylist.Employee;

public class LinkedListSearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Employee :");
		int n=sc.nextInt();
		Employee emp[]=new Employee[n];
		for(int i=0;i<n;i++)
		{
			emp[i]=new Employee();
			
			System.out.println("Enter Emp id");
			emp[i].setEmpid(sc.nextInt());
			
			System.out.println("Enter Emp Name");
			emp[i].setName(sc.next());
			System.out.println("Enter Emp salary");
			emp[i].setSalary(sc.nextInt());
			
		}
		LinkedList<Employee> list=new LinkedList<Employee>();
		Collections.addAll(list, emp);
		Employee e2=new Employee();
		System.out.println("Enter Element to be search :");
		System.out.println("Enter Emp id");
		e2.setEmpid(sc.nextInt());
		
		System.out.println("Enter Emp Name");
		e2.setName(sc.next());
		System.out.println("Enter Emp salary");
		e2.setSalary(sc.nextInt());
	}

}
