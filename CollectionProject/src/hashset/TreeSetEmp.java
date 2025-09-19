package hashset;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetEmp {
	public static void main(String[] args) {
		TreeSet<Employee> obj=new TreeSet<Employee>();
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee();
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter Emp id=");
			emp.setEmpid(sc.nextInt());
			System.out.println("Enter Emp Name=");
			emp.setName(sc.next());
			System.out.println("Enter Emp Salary=");
			emp.setSalary(sc.nextInt());
			obj.add(emp);
		}
		for(Employee emp1:obj)
		{
			System.out.println("Emp="+emp1);
		}
		
	}

}
