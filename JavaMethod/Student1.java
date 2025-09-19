class Student1
{
	int rno;
	String fName,lName;
	String department;
	char gender;
	float per;
	
	void setValues()
	{
		rno=1;
		fName="Shubham";
		lName="Mungase";
		department="Computer";
		gender='M';
		per=90.99f;
	}
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
		Student1 s=new Student1();
		s.setValues();
		s.display();
	}
}