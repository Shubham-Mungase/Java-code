package linkedlist;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

import arraylist.Employee;

	class SortByName implements Comparator<Employee>
	{

		public int compare(Employee e1, Employee e2) {
			return (e1.getName().compareTo(e2.getName()));
		}
		
	}
	public class LinkedListSort1 {

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
			System.out.println("Before Sort :");
			for(int i=0;i<list.size();i++)
			{
				System.out.println("Emp="+list.get(i));
			}
			Collections.sort(list,new SortByName());
			System.out.println("After Sort :");
			for(int i=0;i<list.size();i++)
			{
				System.out.println("Emp="+list.get(i));
			}
		}
	}

