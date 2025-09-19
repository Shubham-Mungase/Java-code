import java.util.*;
class Person
{
	protected int phno;
	protected String name,addr;
	protected void readPerson()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Phone No :");
		phno=sc.nextInt();
		System.out.println("Enter Name :");
		name=sc.next();
		System.out.println("Enter Address :");
		addr=sc.next();
	}
	protected void displayPerson()
	{
		System.out.println("Phone Number ="+phno);
		System.out.println("Name ="+name);
		System.out.println("Address=");
	}
}
