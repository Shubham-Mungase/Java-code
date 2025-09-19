package pack1;

import java.util.Scanner;

public class ExpOfDivUsingThrows {

	public static void main(String[] args) throws ArithmeticException,Exception {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Number :");
			int a=sc.nextInt();
			System.out.println("Enter 2nd Number :");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println("Division ="+c);
	}

}
