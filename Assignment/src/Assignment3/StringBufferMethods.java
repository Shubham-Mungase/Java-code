package Assignment3;

import java.util.Scanner;

public class StringBufferMethods {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=sc.next();
		StringBuffer sb=new StringBuffer(str);
		System.out.println("Length ="+sb.length());
		System.out.println("Capacity ="+sb.capacity());
		System.out.println("Insert String="+sb.insert(0, "Shree"));
		System.out.println("Append ="+sb.append("Shrikant "));
		System.out.println("Deleted String ="+sb.delete(0, 5));
		
	}
}
