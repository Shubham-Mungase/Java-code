package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListEmp {
	public static void main(String[] args) {
		Employee emp[]=new Employee[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<emp.length;i++)
		{
			emp[i]=new Employee();
			
			System.out.println("Enter Emp id");
			emp[i].setEmpid(sc.nextInt());
			
			System.out.println("Enter Emp Name");
			emp[i].setName(sc.next());
			System.out.println("Enter Emp salary");
			emp[i].setSalary(sc.nextInt());
			
		}
		ArrayList<Employee> list=new ArrayList<Employee>()
				;
		
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
		for(int i=0;i<list.size();i++)
		{
			
		}
	}

}
