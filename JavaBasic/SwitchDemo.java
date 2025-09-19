import java.io.*;
class SwitchDemo
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int choice,res,a,b;
		System.out.println("Enter First Number : ");
		a=Integer.parseInt(br.readLine());
		System.out.println("Enter Second Number : ");
		b=Integer.parseInts(br.readLine());
		System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Reminder\n6.Exit");
		System.out.println("Enter Your Choice : ");
		choice=Integer.parseInt(br.readLine());
		switch(choice)
		{
			case 1:
				res=a+b;
				System.out.println("Addition = "+res);
				break;
			case 2:
				res=a-b;
				System.out.println("Substraction = "+res);
				break;

			case 3:
				res=a*b;
				System.out.println("Multiplication = "+res);
				break;

			case 4:
				res=a/b;
				System.out.println("Division = "+res);
				break;

			case 5:
				res=a%b;
				System.out.println("Reminder = "+res);
				break;
			case 6:
				break;
			default:
				System.out.println("Invalid Choice");
				
		}
	}
}