package pack2;

import java.util.InputMismatchException;
import java.util.Scanner;

class ExpNeg extends Exception
{
	int a;

	public ExpNeg(int a) {
		super();
		this.a = a;
	}

	@Override
	public String toString() {
		return "Negative Value Exception occurse due to Negative Value";
	}
	
}
public class UserDefinedException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter Number :");
			int a=sc.nextInt();
			if(a>0)
			{
				System.out.println("Value is positive");
			}
			else
			{
				ExpNeg obj=new ExpNeg(a);
				throw obj;
			}
		}
		catch(ExpNeg e)
		{
			System.out.println("Value is negative\n1"+e);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Mismatch ="+e);
		}
		
		
		
		
		
	}
}
