import java.io.*;
class Studentsearch
{
	private int rollno;
	private String name;
	private float per;
	public void get()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Rollno : ");
			rollno=Integer.parseInt(br.readLine());
			System.out.println("Enter Name : ");
			name=br.readLine();
			System.out.println("Enter Persentage : ");
			per=Float.parseFloat(br.readLine());
		}
		catch(IOException e)
		{
			System.out.println("Exp: "+e);
		}
		
	}
	public void put()
	{
		System.out.println("Roll Number ="+rollno);
		System.out.println("Roll Name ="+name);
		System.out.println("Roll persentage ="+per);
	}
	static int search(Studentsearch s[],String vname,int n)
	{
		int i;
		for(i=0;i<n;i++)
		{
			if(vname.equals(s[i].name))
				return (i);
		}
		return (-1);
	}
	public static void main(String args[]) throws IOException
	{
		int i,j,n;
		String vname;
		Studentsearch s[]=new Studentsearch[10];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no of Student : ");
		n=Integer.parseInt(br.readLine());
		System.out.println("Enter info of Student :");
		for(i=0;i<n;i++)
		{
			s[i]=new Studentsearch();
			s[i].get();
		}
		System.out.println("Enter name of Student to be Search :");
		vname=br.readLine();
		j=Studentsearch.search(s,vname,n);
		if(j!=-1)
		{
			s[i].put();
			
		}
		else
		{
			System.out.println("Record not found");
		}
	}
}
