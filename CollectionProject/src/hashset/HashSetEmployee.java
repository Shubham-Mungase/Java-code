package hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import arraylist.Employee;

public class HashSetEmployee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Employee :");
		int n=sc.nextInt();
		Employee emp[]=new Employee[n];
		HashSet<Employee> set=new HashSet<Employee>();
		for(int i=0;i<n;i++)
		{
			emp[i]=new Employee();
			
			System.out.println("Enter Emp id");
			emp[i].setEmpid(sc.nextInt());
			
			System.out.println("Enter Emp Name");
			emp[i].setName(sc.next());
			System.out.println("Enter Emp salary");
			emp[i].setSalary(sc.nextInt());
			set.add(emp[i]);
		}
		Iterator<Employee> it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
}
