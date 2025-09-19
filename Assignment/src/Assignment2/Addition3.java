package Assignment2;

import java.util.Scanner;

public class Addition3 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number For Two Integer Num Addition");
		System.out.println("Enter First Number :");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number :");
		int num2=sc.nextInt();
		System.out.println("Enter The Number For Two Float Num Addition");
		System.out.println("Enter First Number :");
		float num3=sc.nextFloat();
		System.out.println("Enter Second Number :");
		float num4=sc.nextFloat();
		System.out.println("Addition of Two Integer Number ="+add(num1,num2));
		System.out.println("Addition of Two Float Number ="+add(num3,num4));
	}

	private static float add(float num3, float num4) {
		return num3+num4;
		
	}

	private static int add(int num1, int num2) {
		return num1+num2;
		
	}

}
