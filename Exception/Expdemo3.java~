import java.io.*;
class InvalidargExp extends Exception
{
	int a;
	InvalidargExp(int x)
	{
		a=x;
	}
	public String toString()
	{
		return("Wrong no of Arguments="+a);
	}
}
class InvalidOperatorExp extends Exception
{
	char a;
 	InvalidOperatorExp(char x)
 	{
 		a=x;
 	}
 	public String toString()
 	{
 		return("Worng operator="+a);
 	}
}
class ZeroExp extends Exception
{
	public String toString()
	{
		return("Result is zero");
	}
}
class Expdemo3
{
	public static void main(String args[])
	{
		int a,b,c;
		char op,x;
		try
		{
		System.out.println("no of arg="+args.length);
			if(args.length!=3) 
			  throw new InvalidargExp(args.length);
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			op=args[2].charAt(0);
			System.out.println("char="+op);
			switch(op)
			{
				case '+':c=a+b;
				break;
				case '-':c=a-b;
				break;
				case 'x':c=a*b;
				break;
				case '/':c=a/b;
				break;
				default:
				throw new InvalidOperatorExp(op);
			}
			if(c==0)
			{
				throw new ZeroExp();
				
			}
			System.out.println("RESULT="+c);
			
		}
		catch(NumberFormatException e)
			{
				System.out.println("Exp="+e);
			}
			catch(InvalidargExp e)
			{
				System.out.println("Exp="+e);
			}
			catch(InvalidOperatorExp e)
			{
				System.out.println("Exp="+e);
			}
			catch(ZeroExp e)
			{
				System.out.println("Exp="+e);
			}
	}
}
