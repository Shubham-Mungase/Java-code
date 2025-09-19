import java.io.*;
class Employee extends Person
{
	private int eno,sal;
	public void readEmp()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Employee No : ");
			eno=Integer.parseInt(br.readLine());
			System.out.println("Enter Employee Salary : ");
			sal=Integer.parseInt(br.readLine());
		}
		catch(IOException e)
		{
			System.out.println("Exp="+e);
		}
	}
	public void displayEmp()
	{
		System.out.println("Employee No ="+eno);
		System.out.println("Employee Salary ="+sal);
	}
	
}
