import java.io.*;
class BankMain
{
	public static void main(String args[]) throws IOException
	{
		int amt,choice;
		Bank c=new Bank();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.println("1.ReadInfo");
			System.out.println("2.Display");
			System.out.println("3.Deposit");
			System.out.println("4.Withdraw");
			System.out.println("5.Exit");
			System.out.println("Enter your Choice :");
			choice=Integer.parseInt(br.readLine());
			switch(choice)
			{
				case 1: 
					c.readInfo();
					break;
				case 2:
					c.Display();
					break;
				case 3:
					System.out.println("Enter Amount to Be Deposit :");
					amt=Integer.parseInt(br.readLine());
					c.deposit(amt);
					break;
				case 4:
					System.out.println("Enter Amount to Be Withdraw:");
					amt=Integer.parseInt(br.readLine());
					c.withdraw(amt);
					break;
				case 5:
					break;				
				
			}
		}while(choice!=5);
	}
}
