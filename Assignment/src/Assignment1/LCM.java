package Assignment1;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The First Number :");
		a=sc.nextInt();
		System.out.println("Enter The Second Number :");
		b=sc.nextInt();
		c=a;
		d=b;
		while(a!=b)
		{
			if(a<b)
				a=a+c;
			else
				b=b+d;
		}
		System.out.println("LCM of Two Number is :"+a);
		
	}
}
