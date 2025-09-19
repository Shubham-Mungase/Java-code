import java.io.*;
class Student3
{
	private int rno;
	private String name;
	private float per;
	public void readstu()
	{
		try
		{
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Roll Number : ");
			rno=Integer.parseInt(br.readLine());
			System.out.println("Enter Name : ");
			name=br.readLine();
			System.out.println("Enter Persentage : ");
			per=Float.parseFloat(br.readLine());
			
		}
		catch(Exception e)
		{
			System.out.println("Exception : "+e);
		}
	}
	public void showstu()
	{
		System.out.println("Roll Number = "+rno);
		System.out.println("Name = "+name);
		System.out.println("Persentage = "+per);
	}
	
}
class Student2
{
	public static void main(String args[])
	{
	Student3 s= new Student3();
	s.readstu();
	s.showstu();
	}
}

