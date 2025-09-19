import java.io.*;
class Student1
{
	private int rno;
	private String name;
	private float per;
	public void readstu()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Student Information");
			System.out.println("Enter Roll No : ");
			rno=Integer.parseInt(br.readLine());
			System.out.println("Enter Name : ");
			name=br.readLine();
			System.out.println("Enter Persenage : ");
			per=Float.parseFloat(br.readLine());
		}
		catch(Exception e)
		{
			System.out.println("Exception"+e);
		}
		
	}
	public void showstu()
	{
		System.out.println("Roll No = "+rno);
		System.out.println("Name = "+name);
		System.out.println("Persentage = "+per+"%");		
	}
}
