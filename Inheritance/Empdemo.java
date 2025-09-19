import java.io.*;
import java.util.*;
class Dept
{
	protected int dno;
	protected String dname;
	protected void readDept()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Department No : ");
			dno=Integer.parseInt(br.readLine());
			System.out.println("Enter Department Name : ");
			dname=br.readLine();
		}
		catch(IOException e)
		{
			System.out.println("Exp="+e);
		}
	}	
	protected void displayDept()
	{
		System.out.println("Department No="+dno);
		System.out.println("Department Name="+dname);
		
	}
}
class Emp extends Dept
{
	private int eno,sal;
	protected String ename;
	protected void readEmp()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Employee Number : ");
		eno=sc.nextInt();
		System.out.println("Enter Employee Name : ");
		ename=sc.next();
		System.out.println("Enter Employee Salary : ");
		sal=sc.nextInt();
	}
	protected void displayEmp()
	{
		System.out.println("Employee Number = "+eno);
		System.out.println("Employee Name = "+ename);
		System.out.println("Employee Salary : "+sal);
	}
}
class Empdemo
{
	public static void main(String args[])
	{
		Emp e=new Emp();
		e.readEmp();
		e.readDept();
		e.displayEmp();
		e.displayDept();
	
	}
	
}
