package Assignment3;

import java.util.Scanner;

public class BinaryHexOct {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int a=sc.nextInt();
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toHexString(a));
		System.out.println(Integer.toOctalString(a));
	}

}
