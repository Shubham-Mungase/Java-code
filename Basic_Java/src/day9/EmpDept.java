package day9;

import java.util.Scanner;

//Create a class Dept Having members(deptno,deptname),from this class derived Emp class having mambers(empno,empname,salary).WAP to implement this
public class EmpDept {

	public static void main(String[] args) {
		Employee obj=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emp no:");
		obj.setEmpno(sc.nextInt());
		System.out.println("Enter Emp Name :");
		obj.setEmpname(sc.next());
		System.out.println("Enter Emp Salary:");
		obj.setSalary(sc.nextInt());
		System.out.println("Enter Dept no :");
		obj.setDeptno(sc.nextInt());
		System.out.println("Enter Dept Name :");
		obj.setDeptname(sc.next());
		System.out.println("Inforamtion ="+obj);
	}
}
