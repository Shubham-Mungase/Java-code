import java.io.*;
class Bank
{
	private int accno,bal;
	private String cname;
	public void readInfo()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter Account Number : ");
			accno=Integer.parseInt(br.readLine());
			System.out.print("Enter Name : ");
			cname=br.readLine();
			System.out.print("Enter Account balance : ");
			bal=Integer.parseInt(br.readLine());
		}
		catch(IOException p)
		{
			System.out.println("Exp"+p);
		}
	}
	public void Display()
	{
		System.out.println("Account Number ="+accno);
		System.out.println("Name ="+cname);
		System.out.println("Account balance ="+bal);
	}
	public void withdraw(int amt)
	{
		if(bal-amt>=1000)
		{
			bal=bal-amt;
		}
		else
		{
			System.out.println("Less Amount");
		}
	}
	public void deposit(int amt)
	{
		bal=bal+amt;
	}
}

