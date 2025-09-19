package Assignment6;

import java.util.Scanner;

public class MathDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number :");
		int a=sc.nextInt();
		System.out.println("Enter the Second number :");
		int b=sc.nextInt();
		ImplementRelational ir=new ImplementRelational(a, b);
		ir.greaterThan();
		ir.greaterThanEqual();
		ir.lessThan();
		ir.lessThanEqual();
		ImplementMath im=new ImplementMath();
		im.add(a, b);
	}

}
