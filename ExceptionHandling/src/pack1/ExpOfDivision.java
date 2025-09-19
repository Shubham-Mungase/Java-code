package pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExpOfDivision {
	
	public static void main(String[] args) {
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Number :");
			//int a=sc.nextInt();
			int a=Integer.parseInt(br.readLine());
			System.out.println("Enter 2nd Number :");
			//int b=sc.nextInt();
			int b=Integer.parseInt(br.readLine());
			int c=a/b;
			System.out.println("Division ="+c);
		}
		catch(IOException e)
		{
			System.out.println("Exception :"+e);
			System.out.println("Exception :"+e.getMessage());
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception :"+e);
			System.out.println("Exception :"+e.getMessage());
			e.printStackTrace();
		}
		catch(NumberFormatException e)
		{
			System.out.println("Exception :"+e);
			System.out.println("Exception :"+e.getMessage());
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Exception :"+e);
			System.out.println("Exception :"+e.getMessage());
			e.printStackTrace();
		}
		finally
		{
			System.out.println();
		}
		
	}

}
