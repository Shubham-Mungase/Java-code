class Student 
{
	int rollNo;
	String name;
	Student()
	{
		System.out.println("Default Constructor");
	}
	Student(int rollNo)
	{
		this.rollNo=rollNo;
	}
	Student(String name)
	{
		this.name=name;
	}
	Student(int rollNo,String name)
	{
		this.rollNo=rollNo;
		this.name=name;
	}
	public void display()
	{
		System.out.println("Roll No="+this.rollNo+"\nName="+this.name);
	}
	public static void main(String [] args)
	{
		Student s1=new Student();
		s1.display();
		Student s2=new Student(7,"Shrikant");
		s2.display();
		Student s3=new Student("Shubham");
		s3.display();
		Student s4=new Student(10);
		s4.display();
	}
}