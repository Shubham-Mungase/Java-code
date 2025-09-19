package Assignment1;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int num=sc.nextInt();
		fibbo(num);
	}

	private static void fibbo(int num) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c;
		while(num>0)
		{
			c=a+b;
			System.out.print("\t"+c);
			b=a;
			a=c;
			num--;
		}
		
	}
}

