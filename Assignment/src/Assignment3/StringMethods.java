package Assignment3;

import java.util.Scanner;

public class StringMethods {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String str2=sc.next();
		String str=new String(str2);
		String str1="Shubham";
		System.out.println("Length of String ="+str.length());
		System.out.println("HashCode Of String ="+str.hashCode());
		System.out.println("Equal string ="+str.equals(str1));
		
		String newstr="Shrikant";
		System.out.println("Replaced String ="+str.replace(str1, newstr));
		System.out.println("String Concatination ="+str.concat(str1));
		System.out.println("Compare two String ="+str.compareTo(str1));
		System.out.println("Char At method ="+str.charAt(3));
		System.out.println("Substring ="+str.substring(2,4+1));
		System.out.println("Trim ="+str.trim());
		
	}

}
