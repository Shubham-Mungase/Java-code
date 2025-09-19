class Student
{
	int rno;
	String fName,lName;
	String department;
	char gender;
	float per;
	

	void display()
	{
			System.out.println("Roll No ="+rno);
			System.out.println("First Name ="+fName);
			System.out.println("Last Name ="+lName);
			System.out.println("Department ="+department);
			System.out.println("Gender ="+gender);
			System.out.println("Percentage ="+per);
	}
	
	
	public static void main(String [] args)
	{
		Student s=new Student();
		s.rno=1;
		s.fName="Shubham";
		s.lName="Mungase";
		s.department="Computer";
		s.gender='M';
		s.per=90.99f;
		s.display();
	}
}