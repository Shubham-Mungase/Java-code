package working_pack;

import java.util.Scanner;
import tybcs.*;
public class Math_Max {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number :");
		int a=sc.nextInt();
		System.out.println("Enter Second Number :");
		int b=sc.nextInt();
		System.out.println("Enter Third Number :");
		int c=sc.nextInt();
		System.out.println("Addition of two number ="+Mathematics.add(a, b));
		System.out.println("Addition of Three number ="+Mathematics.add(a, b,c));
		System.out.println("Maximum of two number ="+Maximum.max(a, b));
		System.out.println("Maximum of two number ="+Maximum.max(a, b,c));
	}

}
