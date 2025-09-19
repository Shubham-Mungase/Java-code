package day7Wrapper_String;

import java.util.Scanner;

//convert given decimal number to binary octal and hexa decimal
public class Wrapper1 {
	public static void main(String[] args) {
		int val;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No :");
		val = sc.nextInt();
		System.out.println("Number is=" + val);
		System.out.println("Binary Value is =" + Integer.toBinaryString(val));
		System.out.println("Octal Value is =" + Integer.toOctalString(val));
		System.out.println("Hex Value is =" + Integer.toHexString(val));
		int val1 = Integer.reverse(val);
		System.out.println("Reverse Value =" + val1);
		System.out.println("");
		System.out.println("Binary Value is =" + Integer.toBinaryString(val1));
		int val2 = Integer.reverseBytes(val);
		System.out.println("Reverse Byte =" + val2);
		System.out.println("Binary Value is =" + Integer.toBinaryString(val1));

//		for(int i=0;i<15;i++)
//		{
//			System.out.println("Binary Value is"+i+"="+Integer.toBinaryString(i));
//		}

	}

}
