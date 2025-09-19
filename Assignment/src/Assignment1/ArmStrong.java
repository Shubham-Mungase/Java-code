package Assignment1;

import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		armStrong(num);
		
	}
	private static void armStrong(int num) {
		int x=num;
		int ct=0;
		int sum=0;
		while(num!=0)
		{
			num=num/10;
			ct++;
		}
		num=x;
		while(num!=0)
		{
			int digit=num%10;
			num=num/10;
			 sum=sum+(int)(Math.pow(digit, ct));
		}
		//System.out.println("sum="+sum);
		if(x==sum)
		{
			System.out.println("It is ArmStrong Number");
		}
		else
		{
			System.out.println("It is Not ArmStrong Number");
		}
		
	}

}
