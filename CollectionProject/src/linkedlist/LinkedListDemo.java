package linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import arraylist.Employee;

public class LinkedListDemo {

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
		Employee e;
		Iterator<Employee> it=list.iterator();
		System.err.println("Info of emp");
		while(it.hasNext())
		{
			e=(Employee)it.next();
			System.out.println("Info=\n"+e);
		}
		Employee em=new Employee(1,10000,"Ramesh");
		list.add(2, em);
		System.err.println("After add Info of emp");
		 it=list.iterator();
		 while(it.hasNext())
			{
				em=(Employee)it.next();
				System.out.println("Info=\n"+em);
			}
	}
}
