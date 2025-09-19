package Assignment1;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number :");
		int num=sc.nextInt();
		reverse(num);
		
	}

	private static void reverse(int num) {
		int s=0;
		while(num!=0)
		{
			s=s*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse Number is ="+s);
		
	}

}
