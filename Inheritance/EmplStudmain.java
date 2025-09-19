import java.util.*;
class EmplStudmain
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		Employee e=new Employee();
		Student s=new Student();
		do
		{
			System.out.println("1.Student");
			System.out.println("2.Employee");
			System.out.println("3.Exit");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1: 
					s.readPerson();
					s.readStu();
					s.displayPerson();
					s.displayStu();
					break;
				case 2:
					e.readPerson();
					e.readEmp();
					e.displayPerson();
					e.displayEmp();
					break;
				case 3:
					break;
							
				
			}
		}while(choice!=3);
	}
}
