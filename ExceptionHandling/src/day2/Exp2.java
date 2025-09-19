package day2;
/*
 * 	write a program to enter 2 values and one operator through command line argument and handle the following exception
 * Invalid Argument Exception if no of argument are not satisfied 
 * Invalid Operator Exp if operator is invalid and
 * ZeroExp if result is zero
 * */
public class Exp2 {
	public static void main(String[] args) {
		
		int val1,val2,res;
		char opr;
		try
		{
			if(args.length!=3)
			{
				throw new InvalidArgExp(args.length);
			}
			val1=Integer.parseInt(args[0]);
			val2=Integer.parseInt(args[1]);
			opr=args[2].charAt(0);
			switch(opr)
			{
			case '+':
				res=val1+val2;
				break;
			case '-':
				res=val1-val2;
				break;
			case '*':
				res=val1*val2;
				break;
			case '/':
				res=val1/val2;
				break;
			default:
				throw new InvalidOperator(opr);
			}
			if(res==0)
			{
				throw new ZeroExp();
			}
			System.out.println("Result ="+res);
		}
		catch(InvalidArgExp e)
		{
			System.out.println("Exception ="+e);
		}
		catch(InvalidOperator e)
		{
			System.out.println("Exception ="+e);
		}
		catch(ZeroExp e)
		{
			System.out.println("Exeption ="+e);
		}
		
	}

}
