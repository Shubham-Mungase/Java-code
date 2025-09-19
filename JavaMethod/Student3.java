import java.util.*;
class Student3
{
	int rno;
	String fName,lName;
	String department;
	String gender;
	float per;
	
	void getValues()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll Number : ");
		rno=sc.nextInt();
		System.out.println("Enter First Name : ");
		fName=sc.next();
		System.out.println("Enter Last Name : ");
		lName=sc.next();
		System.out.println("Enter Department : ");
		department=sc.next();
		System.out.println("Enter Gender : ");
		gender=sc.next();
		System.out.println("Enter Percentage : ");
		per=sc.nextFloat();
	}
	void display()
	{
			System.out.println("Roll No ="+rno);
			System.out.println("First Name ="+fName);
			System.out.println("Last Name ="+lName);
			System.out.println("Department ="+department);
			System.out.println("Gender ="+gender);
			System.out.println("Percentage ="+per);
			System.out.println("--------------------------");
	}
	
	
	public static void main(String [] args)
	{
		Student3 s[]=new Student3[10];
		Scanner sc = new Scanner(System.in);
		int num=0;
		System.out.println("Enter How Many Student : ");
		num=sc.nextInt();
		System.out.println("Enter The Info OF Student : ");
		for(int i=1;i<=num;i++)
		{
				s[i]=new Student3();
				s[i].getValues();
		}
		System.out.println("Display Student Info");
		for(int i=1;i<=num;i++)
		{
				s[i].display();
		}
		
		
	}
}